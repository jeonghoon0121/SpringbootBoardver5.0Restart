package com.ohgiraffers.com.boardver5;

import com.ohgiraffers.com.boardver3.BoardV3DTO;
import com.ohgiraffers.com.boardver3.CommentV3DTO;
import com.ohgiraffers.com.boardver3.PostV3DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardV5Mapper {
    List<BoardV3DTO> findAllBoards();
    List<PostV3DTO> findAllPosts();
    List<CommentV3DTO> findAllComments();
    void updatePost(PostV3DTO updatePostV3DTO);
    void deletePost(PostV3DTO deletePostV3DTO);

}
