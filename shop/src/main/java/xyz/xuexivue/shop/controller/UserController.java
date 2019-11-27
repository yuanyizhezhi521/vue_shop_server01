package xyz.xuexivue.shop.controller;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.xuexivue.shop.pojo.User;
import xyz.xuexivue.shop.server.IUserServer;

import java.util.List;

@Controller
@RequestMapping(value = "user",produces = "text/plain;charset=utf-8")
public class UserController {
    @Autowired
    private   IUserServer iUserServer;
    @RequestMapping(value = "all")
    @ResponseBody
    public String UserAll(){
        List<User> users = iUserServer.selectUserAll();
        String s = JSON.toJSONString(users);

        return s;
    }

}
