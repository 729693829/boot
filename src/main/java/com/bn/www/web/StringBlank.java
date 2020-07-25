package com.bn.www.web;

import com.alibaba.fastjson.JSON;
import lombok.extern.java.Log;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Log
public class StringBlank {
    public static void main(String[] args) {
        String s = "";//空
        String ss = " ";//空
        String ssss= null;//空
        String sss = "null";//非空
        stringBlank(ssss);

        List<String> list = new ArrayList();
        list.add(null);
        listBlank(list);
        System.out.println(list.size());
        /*list.add("");
        list.add(" ");
        list.add(null);
        listBlank(list);
        for (String st:list
             ) {
            stringBlank(st);
        }*/

    }

    public static void stringBlank(String string){
        if (StringUtils.isNotBlank(string)){
            log.info("非空字符串");
        }else {
            log.info("空字符串");
        }
    }

    public static void listBlank(List lists){
        if (CollectionUtils.isEmpty(lists)){
            log.info("空字符串");
        }else {
            log.info("非空子符串");
        }

    }

    public static void jsonBlank(JSON json){

    }

}
