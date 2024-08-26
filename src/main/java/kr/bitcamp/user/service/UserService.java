package kr.bitcamp.user.service;

import java.util.List;
import java.util.Optional;

import kr.bitcamp.user.model.domain.UserModel;
import kr.bitcamp.user.model.entity.UserEntity;

public interface UserService {

    List<UserEntity> findAll();
    UserEntity save(UserModel user);
    Optional<UserEntity> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);


    
}
