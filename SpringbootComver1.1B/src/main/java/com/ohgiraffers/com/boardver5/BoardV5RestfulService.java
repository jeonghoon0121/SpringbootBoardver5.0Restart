package com.ohgiraffers.com.boardver5;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardV5RestfulService {

    // 사용자 이름을 저장할 리스트
    private final List<BoardV5DTO> boardList = new ArrayList<>();

    // 초기 테스트용 데이터
    public List<BoardV5DTO> getAllBoards() {
        List<BoardV5DTO> combined = new ArrayList<>(boardList);
        combined.add(new BoardV5DTO("test1"));
        combined.add(new BoardV5DTO("test2"));
        return combined;
    }

    // 사용자 이름 추가
    public void addBoard(String name) {
        boardList.add(new BoardV5DTO(name));
    }
}
