package kr.bitcamp.user.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.bitcamp.user.model.entity.BoardEntity;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    
}
