package com.xingxing.controller.login;

import com.xingxing.authorization.model.RegisterUser;
import com.xingxing.authorization.model.User;
import com.xingxing.commom.model.ResponseResult;
import com.xingxing.service.authorization.LoginService;
import com.xingxing.service.authorization.RegisterService;
import com.xingxing.service.authorization.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Resource
    private LoginService loginService;
    @Resource
    private RegisterService registerService;
    @Resource
    private UserService userService;
    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user){
        String token = loginService.login(user);
        return ResponseResult.SUCCESS(token);
    }

    /**
     * 用户登出
     *
     * @return
     */
    @PostMapping("/loginOut")
    public ResponseResult loginOut(){
        loginService.logout();
        return ResponseResult.SUCCESS();
    }

    /**
     * 用户注册
     *
     * @param registerUser
     * @return
     */
    @PostMapping("/register")
    public ResponseResult register(@RequestBody RegisterUser registerUser){
        registerService.register(registerUser);
        return ResponseResult.SUCCESS();
    }

    @GetMapping("/getUserInfo")
    public ResponseResult getUserInfo(){
        User user = userService.getUserInfo();
        return ResponseResult.SUCCESS(user);
    }
}
