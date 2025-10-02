package com.ohgiraffers.com.boardver5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
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
    /*Redirect방식 1. url*/

    @PostMapping("/resultUrl")
    public String redirectWithUrl(@RequestParam String username,
                                  RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("username", username);
        return "redirect:/boardv5/resultUrl";
    }

    @GetMapping("/resultUrl")
    public String resultUrl(@RequestParam String username,
                            Model model) {
        model.addAttribute("username", username);
        return "boardv5/resultUrl";
    }

    /*Redirect방식 2. 어트리뷰트*/
    /*Redirect방식 3. 세션*/
}
