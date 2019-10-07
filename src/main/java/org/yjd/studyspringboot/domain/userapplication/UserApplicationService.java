package org.yjd.studyspringboot.domain.userapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: yjd
 * @time: 2019-07-28
 * @decription: user存储仓库
 */
// @Repository
@Service
public class UserApplicationService {

    @Autowired
    private UserApplicationRepositpory userApplicationRepositpory;
    /**
     * 采用内存型存储方式 -> map
     */
    // final保证一致性
    private final ConcurrentHashMap<Integer,UserApplication> repository = new ConcurrentHashMap<>();

    // 自增长id声明为
    private final static AtomicInteger idGenerator = new AtomicInteger();

    /**
     * 保存存储对象，成功则返回true
     * @param userApplication
     * @return
     */
    public boolean saveUser(UserApplication userApplication) {/*
        boolean success = false;
        Integer id = idGenerator.getAndIncrement();
        userApplication.setId(id);
        return repository.put(id, userApplication) == null;*/
        return true;
    }

    public List<UserApplication> getUser(String name) {
        return userApplicationRepositpory.getUser(name);
    }
}
