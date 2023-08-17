package com.xingxing.controller.im;

import com.xingxing.service.im.WebSocketService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
@Api(value = "信息") //swagger2注解
@RequestMapping("/message")
public class MessageController {
    @Resource
    WebSocketService webSocketService;

    /**
     * 发送消息接口
     *
     * @param message   消息
     * @return
     */
    @GetMapping("/send")
    public ResponseEntity<String> sendMessage() throws IOException {
        return ResponseEntity.ok().build();
    }
}
