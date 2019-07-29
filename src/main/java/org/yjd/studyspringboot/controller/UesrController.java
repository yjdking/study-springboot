package org.yjd.studyspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yjd.studyspringboot.domain.User;
import org.yjd.studyspringboot.domain.repository.UserRepository;

@RestController
public class UesrController {

    @Autowired
    private  UserRepository userRepository;

    public UesrController() {
        userRepository = null;
    }

    @PostMapping("/person/save")
    public User save(@RequestParam String name){
        User user = new User();
        if (userRepository.saveUser(user)) {
            System.out.println("用户对象" + user );
        }

        return user;
    }
}
