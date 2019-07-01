package com.bit.web.controller;

import com.bit.web.common.util.Printer;
import com.bit.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {

    @Autowired CustomerService customerService; // 자동으로 연결? -> 스레드 
    @Autowired Printer p;
    
    @RequestMapping("/")
    public String index() {
        System.out.println("루트 URL");
        return "index";
    }
}