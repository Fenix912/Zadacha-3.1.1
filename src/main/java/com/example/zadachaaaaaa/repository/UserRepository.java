package com.example.zadachaaaaaa.repository;

import com.example.zadachaaaaaa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();
    User findUserById(Long id);
}