package com.bn.www.web;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class StudentController {

    @RequestMapping ("sj")
    public Student getSdudent(){
        Student student = new Student();
        List<String> interested = new ArrayList<>();
        interested.add("钓鱼");
        interested.add("篮球");
        interested.add("火锅");
        student.setName("陈能发");
        student.setGrade("三年级-2班");
        student.setScore("90");
        student.setStatus(3);
        student.setInterested(interested);
        log.info(student.toString());
        JSONObject jsonOString = (JSONObject)JSON.toJSON(student);
        Student object = JSON.parseObject(jsonOString.toString(),Student.class);
        System.out.println(jsonOString);
        System.out.println(object);
        return student;
    }
}
