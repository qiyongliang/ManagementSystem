package com.fulin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qiyongliang
 * @date 2019/4/22-20:03
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("login")
    public String sayHello(){
        return "/login/login";
    }
}
