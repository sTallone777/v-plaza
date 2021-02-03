package com.ranbo.vplaza.app.controller.test;

import com.ranbo.vplaza.annotation.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aoplog")
public class AopLogTest {

    @GetMapping("/Method1")
    @Log
    public String method1(){
//        System.out.println("log");
        return "Hello Log.";
    }
}
