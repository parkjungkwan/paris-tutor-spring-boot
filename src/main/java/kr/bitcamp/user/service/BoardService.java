package kr.bitcamp.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import kr.bitcamp.user.model.domain.BoardModel;
import kr.bitcamp.user.model.domain.UserModel;
import kr.bitcamp.user.model.entity.BoardEntity;
import kr.bitcamp.user.model.entity.UserEntity;

@Service
public interface BoardService  {
    List<BoardEntity> findAll();
    BoardEntity save(BoardModel user);
    Optional<BoardEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}
