package com.ranbo.vplaza.app.controller;

import com.ranbo.vplaza.annotation.ExecTimeLog;
import com.ranbo.vplaza.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {
    @Autowired
    TestService ts;

    @GetMapping("/getlog")
    @ExecTimeLog
    public String method1(){
        return ts.getUserList().toString();
    }
}
