package com.ohgiraffers.boardver5.service;

import com.ohgiraffers.com.boardver5.BoardV5DTO;
import org.springframework.stereotype.Service;

@Service
public class BoardV5RestfulService {

    public String getUser(String name) {
        return name + "님, 서버에서 데이터를 받았습니다.";
    }

    public String registerUser(BoardV5DTO userDto) {
        return userDto.getName() + "님, 등록이 완료되었습니다.";
    }
}
