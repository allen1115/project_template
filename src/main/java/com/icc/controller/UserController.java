package com.icc.controller;

import com.icc.pojo.User;
import com.icc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 *  用户登陆控制器
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/view")
    public String view() {
        return "login";
    }

    @RequestMapping("/indexview")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(User model, HttpSession session) {
        User user = userService.getUserByUsername(model.getUsername());

        if(user == null || !user.getPassword().equals(model.getPassword())) {
            return new ModelAndView("redirect:/login.jsp");
        } else {
            session.setAttribute("user", user);
            ModelAndView mav = new ModelAndView();
            mav.setViewName("index");
            return mav;
        }
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public Object addUser(@RequestBody User user) {
        int num = userService.addUser(user);
        System.out.println(num);
        Map<String, Object> map = new HashMap();
        map.put("num", num);
        return map;
    }

    @RequestMapping(value = "/test")
    public String test() {
        System.out.println("111111111111111111111");
        return "test";
    }
}
