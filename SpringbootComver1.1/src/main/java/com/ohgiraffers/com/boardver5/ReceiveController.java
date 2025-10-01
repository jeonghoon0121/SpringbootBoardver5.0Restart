package com.ohgiraffers.com.boardver5;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boardv5")
public class ReceiveController {

    @PostMapping("/receive")
    public String receiveData(@RequestParam String username, @RequestParam int age) {
        return "받은 사용자: " + username + ", 나이: " + age;
    }
    @GetMapping("/receive")
    public String blockDirectAccess() {
        return "이 페이지는 직접 접근할 수 없습니다. 폼을 통해 전송해주세요.";
    }

}

