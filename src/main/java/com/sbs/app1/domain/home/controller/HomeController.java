package com.sbs.app1.domain.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Hello";
    }

    @GetMapping("/home/main1")
    @ResponseBody
    public String main1() {
        return "안녕하세요";
    }

    @GetMapping("/home/main2")
    @ResponseBody
    public String main2() {
        return "반갑습니다";
    }
}
