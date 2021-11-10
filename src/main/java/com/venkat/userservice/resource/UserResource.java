package com.venkat.userservice.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    @RequestMapping("/all")
    public List<String> getAllUsers(){
        List<String> users = new ArrayList<>();
        users.add("venkat");
        users.add("Gyan");
        return users;
    }
}
