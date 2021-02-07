package com.ranbo.vplaza.app.controller;

import com.ranbo.vplaza.annotation.ExecTimeLog;
import com.ranbo.vplaza.api.service.TestService;
import com.ranbo.vplaza.db.model.MAdminPermission;
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

    @ExecTimeLog
    @GetMapping("/addAdmin")
    public int method2(){
        MAdminPermission admin = new MAdminPermission();
        admin.setPermissionCode((byte)(1&0xFF));
        admin.setPermissionName("super admin");
        return ts.addAdmin(admin);
    }
}
