package com.ranbo.vplaza.api.service;

import com.ranbo.vplaza.annotation.ExecTimeLog;
import com.ranbo.vplaza.db.mapper.MAdminPermissionMapper;
import com.ranbo.vplaza.db.model.MAdminPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class TestService {
    @Autowired
    MAdminPermissionMapper adminMapper;

    @ExecTimeLog
    public List<String> getUserList(){
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");
        return userList;
    }
    @ExecTimeLog
    public int addAdmin(MAdminPermission adminPermission) {
        try {
            int result = adminMapper.insert(adminPermission);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
