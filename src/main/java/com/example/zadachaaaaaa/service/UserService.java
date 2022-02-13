package com.example.zadachaaaaaa.service;

import com.example.zadachaaaaaa.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUser();
    void addUser(User user);
    void deleteById(Long id);
    User getUserById(Long id);
    void updateUser(User user);
}
