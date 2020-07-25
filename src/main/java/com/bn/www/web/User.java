package com.bn.www.web;


import java.util.List;
import java.util.Map;
public class User{

    private String name ;
    private Integer age ;
    private List<String> interests;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    private Map<String,String> score;

    public Map<String, String> getScore() {
        return score;
    }

    public void setScore(Map<String, String> score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", interests=" + interests +
                ", dept=" + dept +
                ", score=" + score +
                '}';
    }
}
