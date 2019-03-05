package com.len.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zengrui
 * @date 2019/3/15.
 * @email 1597582142@163.com
 * <p>
 * 建议流程
 */
@Controller
@RequestMapping("/advice")
public class UserAdviceController {


    @GetMapping(value = "addAdvice")
    public String addAdvice(Model model) {
        return "/act/advice/add-advice";
    }


    @GetMapping(value = "showAdvice")
    public String showUser(Model model) {
        return "/act/advice/adviceList";
    }
}
