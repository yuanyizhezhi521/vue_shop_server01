package xyz.xuexivue.shop.controller;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.xuexivue.shop.pojo.User;
import xyz.xuexivue.shop.server.IUserServer;

import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController {
@Autowired
  private   IUserServer iUserServer;
@RequestMapping(value = "all")
public String UserAll(){
    List<User> users = iUserServer.selectUserAll();
    String s = JSON.toJSONString(users);

    return s;
}

}
