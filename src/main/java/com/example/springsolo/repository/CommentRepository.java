package com.example.springsolo.repository;

import com.example.springsolo.entity.BoardEntity;
import com.example.springsolo.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.stream.events.Comment;
import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    List<CommentEntity> findAllByBoardEntityOrderByIdDesc(BoardEntity boardEntity);

}
