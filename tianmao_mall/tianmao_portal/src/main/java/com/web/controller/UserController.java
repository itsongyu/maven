package com.web.controller;

import com.tianmao.pojo.User;
import com.tianmao.service.UserService;
import com.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController<UserController> {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/logintest", method = RequestMethod.GET)
    public String login() {
        System.out.println("登陆成功！！！");
        return "login";
    }

    @RequestMapping("/login")
    public String login(String tname, String pwd) {
        User u = userService.findByString(tname, pwd);
        System.out.println(u.toString());
        return INDEX_PAGE;
    }

    @RequestMapping("/find")
    public String find(Integer id) {
        User user = userService.findById(id);
        System.out.println(user);
        return "index";
    }

}
