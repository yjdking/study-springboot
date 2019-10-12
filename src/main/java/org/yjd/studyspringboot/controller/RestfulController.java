package org.yjd.studyspringboot.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yjd.studyspringboot.controller.dto.RestfulRequest;

@RestController
// @RequestMapping("/restful")
public class RestfulController {

    @GetMapping("/pathvariable/{id}")
    public String test(@PathVariable String id){
        return "SUCCESS: id, " + id;
    }

    @GetMapping("/requestparam/value")
    public String testRequestParamRestful(@RequestParam String name, int id){
        return  "Restful successed: " + "name: " +  name +  ",id: " + id;
    }

       @GetMapping("/requestparam/object")
    public String testRequestParamRestful(@RequestParam RestfulRequest userRestfulRequest){
        return  "Restful successed: " + JSON.toJSONString(userRestfulRequest);
    }

    @GetMapping("/object")
    public String testRestful(RestfulRequest userRestfulRequest){
        return  "Restful successed: " + JSON.toJSONString(userRestfulRequest);
    }

    @PutMapping("/pathvariable/{id}")
    public String puttest(@PathVariable String id){
        return "SUCCESS: id, " + id;
    }

    @PutMapping("/requestparam/value")
    public String putTestRequestParam(@RequestParam String name, int id){
        return  "Restful successed: " + "name: " +  name +  ",id: " + id;
    }
}
