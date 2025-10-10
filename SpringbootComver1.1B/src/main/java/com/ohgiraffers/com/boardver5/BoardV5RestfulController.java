package com.ohgiraffers.com.boardver5;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/restful/boardv5")
@CrossOrigin(origins = "http://localhost:8001")
public class BoardV5RestfulController {

    private final BoardV5RestfulService service;

    public BoardV5RestfulController(BoardV5RestfulService service) {
        this.service = service;
    }

    // 사용자 이름을 받아서 저장하고 메시지 반환
    @GetMapping("/user")
    public ResponseEntity<Map<String, String>> getUser(@RequestParam String name) {
        service.addBoard(name); // 이름 저장
        Map<String, String> response = new HashMap<>();
        response.put("message", name + "님, 서버에서 데이터를 받았습니다.");
        return ResponseEntity.ok(response);
    }
    @PostMapping("/user")
    public ResponseEntity<Map<String, String>> receiveUser(@RequestBody Map<String, String> payload) {
        String name = payload.get("name");
        service.addBoard(name); // 이름 저장

        Map<String, String> response = new HashMap<>();
        response.put("message", name + "님, 서버에서 데이터를 받았습니다.");
        return ResponseEntity.ok(response);
    }


    // 저장된 모든 사용자 이름 목록 반환
    @GetMapping("/all")
    public ResponseEntity<List<BoardV5DTO>> getAllUsers() {
        return ResponseEntity.ok(service.getAllBoards());
    }
}
