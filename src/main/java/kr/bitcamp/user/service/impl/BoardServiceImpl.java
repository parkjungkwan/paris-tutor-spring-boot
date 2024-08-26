package kr.bitcamp.user.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import kr.bitcamp.user.model.domain.BoardModel;
import kr.bitcamp.user.model.entity.BoardEntity;
import kr.bitcamp.user.model.repository.BoardRepository;
import kr.bitcamp.user.service.BoardService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public List<BoardEntity> findAll() {
       return boardRepository.findAll();
    }

    @Override
    public BoardEntity save(BoardModel user) {
        BoardEntity entity = new BoardEntity();
        return boardRepository.save(entity);   
    }

    @Override
    public Optional<BoardEntity> findById(Long id) {
       return boardRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return boardRepository.equals(id);
    }

    @Override
    public long count() {
        return boardRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        boardRepository.deleteById(id);
    }

    
    
}
