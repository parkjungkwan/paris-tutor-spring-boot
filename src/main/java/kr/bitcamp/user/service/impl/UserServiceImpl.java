package kr.bitcamp.user.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.bitcamp.user.model.domain.UserModel;
import kr.bitcamp.user.model.entity.UserEntity;
import kr.bitcamp.user.model.repository.UserRepository;
import kr.bitcamp.user.service.*;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    
    private final UserRepository userRepository;

    @Override
    public List<UserEntity> findAll() {
       return userRepository.findAll();
    }

    @Override
    public UserEntity save(UserModel user) {

        UserEntity entity = new UserEntity();

        return userRepository.save(entity);
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
       return userRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return userRepository.existsById(id);
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
    
}
