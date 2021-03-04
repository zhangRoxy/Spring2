package com.zrs.controller;

import com.zrs.bean.User;
import com.zrs.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;


@Data
@Controller
public class UserController {

    @Resource
    UserService userService;

    public void list(){
        List<User> users = userService.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
