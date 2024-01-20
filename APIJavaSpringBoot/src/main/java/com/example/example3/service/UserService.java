package com.example.example3.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.example3.entity.User;

public interface UserService {
    public User createUser(User user);

    public User getUserById(Long userId);

    public Page<User> getAllUsers(Pageable pageable);

    public User updateUser(User user);

    public void deleteUser(Long userId);
}
