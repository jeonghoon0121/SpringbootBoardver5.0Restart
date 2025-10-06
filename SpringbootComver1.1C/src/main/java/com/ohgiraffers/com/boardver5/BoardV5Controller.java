package com.ohgiraffers.com.boardver5;

import jakarta.servlet.http.HttpSession;
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
    /*Redirect방식 1. url
    * URL에 쿼리 파라미터로 붙음*/

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

    /*Redirect방식 2. 어트리뷰트
    * -  Spring의 FlashMap에 저장되어 다음 요청에서만 사용됩니다
    - 수신 컨트롤러에서 @ModelAttribute로 받습니다
    - URL에 노출되지 않음, 보안에 더 적합
    - 한 번만 사용 가능, 이후 자동 삭제
    */
    @PostMapping("resultFlash")
    public String redirectWithFlash(@RequestParam String username,
                                    RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("username", username);
        return "redirect:/boardv5/resultFlash";
    }

    @GetMapping("resultFlash")
    public String resultFlash(@ModelAttribute("username") String username,
                              Model model) {
        model.addAttribute("username", username);
        return "boardv5/resultFlash";
    }


    /*Redirect방식 3. 세션*/
    @PostMapping("/resultSession")
    public String redirectWithSession(@RequestParam String username,
                                      HttpSession session) {
        session.setAttribute("username", username);
        return "redirect:/boardv5/resultSession";
    }

    @GetMapping("/resultSession")
    public String resultSession(HttpSession session, Model model) {
        String username = (String) session.getAttribute("username");
        model.addAttribute("username", username);
        return "boardv5/resultSession";
    }

}
