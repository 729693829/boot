package com.bn.www.web;

import java.util.List;

public class Response1 {

   /* *//* 返回值的状态码 *//*
    private Integer status;*/

    /* 自定义的返回值信息 */
    private String message;

    /* 自定义的返回值信息 */
    private String date;

    /* 返回值的目标信息 */
    private List<Result> results;

   /* public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }*/

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Response1{" +
                "message='" + message + '\'' +
                ", date='" + date + '\'' +
                ", results=" + results +
                '}';
    }
}
