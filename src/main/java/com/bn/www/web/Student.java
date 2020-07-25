package com.bn.www.web;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Student {
    private String name;
    private String grade;
    private String score;
    private Integer status;
    private List<String> interested;
}
