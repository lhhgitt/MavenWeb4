package com.lihui.controller;

import com.lihui.pojo.User;
import com.lihui.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/addUser")
    public ModelAndView addUser(User user){
        ModelAndView mav=new ModelAndView();
        userService.addUser(user);
        mav.setViewName("/WEB-INF/jsp/success.jsp");
        return mav;

    }
}
