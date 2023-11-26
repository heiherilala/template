package com.example.templet.service;


import com.example.templet.model.entity.User;
import com.example.templet.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public User getById(String userId) {
    return userRepository.getReferenceById(userId);
  }

  public List<User> getAll() {
    return userRepository.findAll();
  }

  @Transactional
  public List<User> saveAll(List<User> users) {
    List<User> savedUsers = userRepository.saveAll(users);
    return savedUsers;
  }

}
