package com.example.compose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @Autowired
  private UserRepository userRepository;
  @GetMapping("hello")
  public String hello(){
    return "hello";
  }

  @GetMapping("all")
  public List<User> all() {
    return userRepository.findAll();
  }
  
  @PostMapping("add")
  public User add(@RequestBody User user) {
    User savedUser = userRepository.save(user);
    return savedUser;
  }
}
