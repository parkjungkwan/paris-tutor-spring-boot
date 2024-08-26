package kr.bitcamp.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;

import kr.bitcamp.user.model.domain.BoardModel;
import kr.bitcamp.user.model.entity.BoardEntity;
import kr.bitcamp.user.service.BoardService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class BoardController  {
    private final BoardService boardService;
    
    public List<BoardEntity> findAll() {
        return boardService.findAll();    

    }

    
    public BoardEntity save(BoardModel user) {

        
        return boardService.save(user);
    }

    
    public Optional<BoardEntity> findById(Long id) {
        return boardService.findById(id);
    }

    
    public boolean existsById(Long id) {
        return boardService.existsById(id);

    }

    
    public long count() {
        return boardService.count();
    }

    
    public void deleteById(Long id) {
        boardService.deleteById(id);
    }

        
    
}
