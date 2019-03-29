package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: UserController
 * @Auther: zhengchen
 * @Date: 2019/3/29 15:23
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("/user/userIndex");
        return modelAndView;
    }
}
