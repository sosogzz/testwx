package com.example.testwx.wxcallback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : huyanzhuo
 * @date : 2019/2/26 3:05 PM
 */
@RestController
public class WxCallBack {
    @RequestMapping("/hello")
    private String hello() {
        return "hello wx!!";
    }

}
