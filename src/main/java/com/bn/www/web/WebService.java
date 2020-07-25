package com.bn.www.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class WebService {

    public static final Logger LOGGER = LoggerFactory.getLogger(WebService.class);

    // http://localhost:8081/web?name=cnf
    //@GetMapping("web")
    // http://localhost:8081/web?name=cn
    @RequestMapping("web")
    public String sayHellow(String name){
        LOGGER.info(name);
        return String.format("Hello %s" , name);
    }

    @RequestMapping("json")
    public User getJson( @RequestBody User user){
        LOGGER.info(user.toString());
        User person = new User();
        List<String> list = new ArrayList<>();
        person.setName(user.getName());
        person.setAge(user.getAge());
        person.setScore(user.getScore());
        for (String i: user.getInterests()
             ) {
            list.add(i);
        }
        person.setInterests(list);
        person.setDept(user.getDept());
        return person;
    }

    @RequestMapping("out")
    public User outJson(){
        User person = new User();
        List list = new ArrayList();
        Map maps = new HashMap();
        Dept dept = new Dept();
        person.setName("Alpha");
        person.setAge(33);
        list.add("游泳");
        list.add("读书");
        list.add("钓鱼");
        person.setInterests(list);
        maps.put("数学","99");
        maps.put("语文","102");
        maps.put("英语","129");
        person.setScore(maps);
        dept.setCity("海口");
        dept.setProvince("海南");
        dept.setDitrict("海淀区");
        dept.setClassName("海南大学");
        person.setDept(dept);
        return person;
    }


}
