package com.ohgiraffers.com.boardver5;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boardv5")
public class BoardV5Controller {
    private final BoardV5Service boardV5Service;
    public BoardV5Controller(BoardV5Service boardV5Service) {
        this.boardV5Service = boardV5Service;
    }
    @GetMapping
    public String redirectToHome1() {
        return "redirect:/boardv5/home";
    }
    @GetMapping("/")
    public String redirectToHome2() {
        return "redirect:/boardv5/home";
    }
    @GetMapping("/home")
    public String redirectToHome3(Model model) {
        return "boardv5/home";
    }
    @PostMapping("/receive")
    public String receiveData1(@RequestParam String username, @RequestParam int testvalue) {
        return "받은 사용자: " + username + ", test: " + testvalue;
    }
    @GetMapping("/receive")
    public String receiveData2(@RequestParam String username, @RequestParam int testvalue) {
        return "받은 사용자: " + username + ", test: " + testvalue;
    }
    @PostMapping("/receive1")
    public String receiveData3(@RequestParam String username, @RequestParam int testvalue1
    ,@RequestParam int testvalue2,@RequestParam int testvalue3) {
        return "받은 사용자: " + username + ", test: " + testvalue1 + ", test: " + testvalue2 + ", test: " + testvalue3;
    }
    @GetMapping("/receive1")
    public String receiveData4(@RequestParam String username, @RequestParam int testvalue1
            ,@RequestParam int testvalue2,@RequestParam int testvalue3) {
        return "받은 사용자: " + username + ", test: " + testvalue1 + ", test: " + testvalue2 + ", test: " + testvalue3;
    }

}
