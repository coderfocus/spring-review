package com.coderfocus.controller;

import com.coderfocus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"","hi"},method = RequestMethod.GET)
    public String hi(){
        return "hi";
    }

    @ResponseBody
    @RequestMapping(value = "getName",method = RequestMethod.GET)
    public String getName() {
        return userService.getName();
    }
}
