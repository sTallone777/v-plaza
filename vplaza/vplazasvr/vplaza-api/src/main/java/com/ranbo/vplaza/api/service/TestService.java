package com.ranbo.vplaza.api.service;

import com.ranbo.vplaza.annotation.ExecTimeLog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {
    @ExecTimeLog
    public List<String> getUserList(){
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");
        return userList;
    }
}
