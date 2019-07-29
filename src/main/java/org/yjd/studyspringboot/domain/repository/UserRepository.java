package org.yjd.studyspringboot.domain.repository;

import org.springframework.stereotype.Repository;
import org.yjd.studyspringboot.domain.User;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: yjd
 * @time: 2019-07-28
 * @decription: user存储仓库
 */
@Repository
public class UserRepository {

    /**
     * 采用内存型存储方式 -> map
     */
    // final保证一致性
    private final ConcurrentHashMap<Integer,User> repository = new ConcurrentHashMap<>();

    // 自增长id声明为
    private final static AtomicInteger idGenerator = new AtomicInteger();

    /**
     * 保存存储对象，成功则返回true
     * @param user
     * @return
     */
    public boolean saveUser(User user) {
        boolean success = false;
        Integer id = idGenerator.getAndIncrement();
        user.setId(id);
        return repository.put(id, user) == null;
    }
}
