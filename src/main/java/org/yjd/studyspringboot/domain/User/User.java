package org.yjd.studyspringboot.domain;

/**
 * @author: yjd
 * @description: user pojo对象
 * @time: 2019-07-28
 */
public class User {
    // 用户名称
    private int id;

    // 用户名字
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
