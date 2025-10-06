package com.ohgiraffers.com.boardver5;

public class BoardV5DTO {
    private String name;
    public BoardV5DTO(){}

    public BoardV5DTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BoardV5DTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
