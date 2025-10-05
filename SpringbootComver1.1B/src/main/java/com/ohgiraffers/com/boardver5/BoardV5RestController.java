package com.ohgiraffers.com.boardver5;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:8001")
@RestController
@RequestMapping("/restful/boardv5")
public class BoardV5RestController {

    @GetMapping("/user")
    public ResponseEntity<Map<String, String>> getUser(@RequestParam String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", name + "님, 서버에서 데이터를 받았습니다.");
        return ResponseEntity.ok(response);
    }
}
