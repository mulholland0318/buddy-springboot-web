package com.lug.buddyspringbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @Author ：lug
 * @Date ：Created in 15:20 2022/12/19 2022
 * @Email ： 251326268@qq.com
 * @Version: ：v1.0.0
 */
@RestController
public class BuddyController {

    @RequestMapping("/buddy")
    public String helloBuddy(){
        return "hello buddy!";
    }
}
