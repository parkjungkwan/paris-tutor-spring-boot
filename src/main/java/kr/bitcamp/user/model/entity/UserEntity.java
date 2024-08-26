package kr.bitcamp.user.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="users")
@Data
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
}
