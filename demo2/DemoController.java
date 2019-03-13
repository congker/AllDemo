package com.statics.demo.controller.statistics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuwencong on 2019/1/30
 */
@RestController
public class DemoController {

    @RequestMapping("web")
    public String test(){
    return "Hello Winson";
    }



}
