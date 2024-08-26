package kr.bitcamp.user.model.domain;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Data;

@Builder
@Component
@Data
public class UserModel {

    private Long id;
    
    
}
