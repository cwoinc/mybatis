package com.wantdo.mybatis.controller;

import com.sun.tools.internal.ws.processor.model.Model;
import com.wantdo.mybatis.entity.User;
import com.wantdo.mybatis.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    @ResponseBody
    public User toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        return user;
    }

}