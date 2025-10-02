package com.ohgiraffers.com.boardver5;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boardv5Rest")
public class BoardV5RestController {

    /*Request방식 1.get방식*/

    @PostMapping("/receive")
    public String receiveData1(@RequestParam String username) {
        return "받은 사용자: " + username;
    }

    /*Request방식 1.post방식*/

    @GetMapping("/receive")
    public String receiveData2(@RequestParam String username) {
        return "받은 사용자: " + username;
    }
}