package com.sbs.app1.domain.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    public int val = -1;

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

    @GetMapping("/home/increase")
    @ResponseBody
    public int showIncrease() {

        return ++val;
    }

    @GetMapping("/home/decrease")
    @ResponseBody
    public int showDecrease() {

        return --val;
    }

    @GetMapping("/home/initNumber")
    @ResponseBody
    public String initNumber() {
        val = -1;
        return "값을 초기화 합니다";
    }

    //스프링부트는 쿼리스트링의 파라메터를 함수 매개변수로 방을 수 있다.
    @GetMapping("/home/plus")
    @ResponseBody
    public int showPlus(int a, int b) {
        return a + b;
    }
}
