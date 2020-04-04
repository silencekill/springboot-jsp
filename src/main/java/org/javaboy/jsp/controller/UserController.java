package org.javaboy.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("get")
    public String get(String username,Model model){
        model.addAttribute("username",username);
        return "user/hello";
    }
}
