package com.xingxing.controller.login;

import com.xingxing.authorization.model.User;
import com.xingxing.commom.model.ResponseResult;
import com.xingxing.service.authorization.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class LoginController {


    @Resource
    private LoginService loginService;

    @PostMapping("/user/login")
    public ResponseResult<Map> login(@RequestBody User user){

        return loginService.login(user);
    }

}
