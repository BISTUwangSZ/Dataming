package cn.com.dataming.predictionapi.controller;

import cn.com.dataming.entity.module.UserEntity;
import cn.com.dataming.predictionapi.service.LoginService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/checkUserInfo")
    @ResponseBody
    public UserEntity login(@RequestBody String getStr, HttpServletRequest request) {
        UserEntity user = JSON.parseObject(getStr,UserEntity.class);
        return loginService.login(user,request);
    }
}
