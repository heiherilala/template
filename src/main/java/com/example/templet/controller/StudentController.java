package com.example.templet.controller;


import java.util.List;

import com.example.templet.model.entity.User;
import com.example.templet.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StudentController {
  private final UserService userService;
  @GetMapping("/students/{id}")
  public User getStudentById(@PathVariable String id) {
    return userService.getById(id);
  }


  @GetMapping("/students")
  public List<User> getStudents() {
    return userService.getAll();
  }

  @PutMapping("/students")
  public List<User> saveAll(@RequestBody List<User> toWrite) {
    return userService.saveAll(toWrite);
  }


}
