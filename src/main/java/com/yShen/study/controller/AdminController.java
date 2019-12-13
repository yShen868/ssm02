package com.yShen.study.controller;

import com.yShen.study.model.Admin;
import com.yShen.study.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


@Controller
public class AdminController {

    IAdminService adminService;

    public IAdminService getAdminService() {
        return adminService;
    }
    @Autowired
    public void setAdminService(IAdminService adminService) {
        this.adminService = adminService;
    }


    @RequestMapping("/")
    public String login() {
//        System.out.println(adminService.selectAdmin("123"));
        return "login";
    }
    @RequestMapping("/in")
    public String index() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String in() {
        return "index";
    }

//退出登录
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
//登录
    @ResponseBody
    @RequestMapping(value = "/login/goto",method = RequestMethod.POST)
    public GsonResult add(@RequestBody Admin admin, HttpSession httpSession){
        GsonResult gsonResult = new GsonResult();
        Admin admin1 = adminService.selectAdmin(admin.getUsername());
        if (admin1.getPassword().equals(admin.getPassword())) {
            gsonResult.setCode(1);
            gsonResult.setMsg("登陆成功");
            httpSession.setAttribute("admin",admin);
        }else {
            gsonResult.setCode(0);
            gsonResult.setMsg("登陆失败");
        }
        return gsonResult;
    }




}
