package org.yjd.studyspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yjd.studyspringboot.domain.userapplication.UserApplication;
import org.yjd.studyspringboot.domain.userapplication.UserApplicationService;

import java.util.List;

@RestController
public class UesrController {

    @Autowired
    private UserApplicationService UserApplicationService;

    @PostMapping("/person/post")
    public UserApplication save(@RequestParam String name){
        UserApplication userApplication = new UserApplication();
        /*if (userRepository.saveUser(userApplication)) {
            System.out.println("用户对象" + userApplication);
        }*/

        return userApplication;
    }

    @GetMapping("/person")
    public List<UserApplication> get(@RequestParam String name){
        return  UserApplicationService.getUser(name);
    }


}
