package com.bn.www.web;
import com.bn.www.web.Result;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class WeatherController {

    public static final Logger Log= LoggerFactory.getLogger(WebService.class);

    @RequestMapping("w")
    public Response putjson(){

        /**
         * 构建三级目标
         */
        List<Weather> weatherList = new ArrayList<>();
        Weather weather = new Weather();
        weather.setDate("星期三");
        weather.setDayPictureUrl("www.baitian.com");
        weather.setNightPictureUrl("www.wanshang.com");
        weather.setWind("东南方5-6级");
        weather.setTemperature("28℃");
        Weather weather2 = new Weather();
        weather2.setDate("星期四");
        weather2.setDayPictureUrl("www.baitian.com");
        weather2.setNightPictureUrl("www.wanshang.com");
        weather2.setWind("西南方5-6级");
        weather2.setTemperature("30℃");
        weatherList.add(weather);
        weatherList.add(weather2);

        /**
         * 构建二级目标
         */
        Result result = new Result();
        List<Result> resultList = new ArrayList<>();
        result.setCurrentCity("深圳");
        result.setWeather_data(weatherList);
        resultList.add(result);

        /**
         * 构建一级目标
         */
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Response response = new Response();
        response.setDate(dateFormat.format(new Date()));
        response.setMessage("返回成功");
        response.setStatus(200);
        response.setResults(resultList);
        return response;
    }

    @RequestMapping("r")
    public Response getJson(@RequestBody Response r){
        /* 构建一级对象 */
        Response response = new Response();
        response.setStatus(r.getStatus());
        response.setMessage(r.getMessage());
        response.setDate(r.getDate());
        response.setResults(r.getResults());
        Log.info(response.toString());

         /* 构建二级对象 */
        for (Result rs:response.getResults()
             ) {
            Result result = rs;
            Log.info(result.toString());
            for (Weather w: result.getWeather_data()
                 ) {
                Weather weather = w;
                Log.info(weather.toString());
            }
        }
        return response;
    }

    /*@RequestMapping("z")
    public String fastJson(@RequestBody Response response){
       JSONObject object = JSON.parseObject(response.toString());
        Log.info(object.toString());
        return "ok";
    }*/

    public void getCll(){

    }
    public void getCall(){

    }

}
