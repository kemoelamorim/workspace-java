package br.com.kemoel.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kemoel.models.User;

@RestController
@RequestMapping("/users")
public class UserController {
  
  public List<User> users = new ArrayList<>();

  @GetMapping("/{id}")
  public User user(@PathVariable("id") Long id){
    Optional<User> userFind = users.stream().filter(user -> user.getId() == id).findFirst();
    if(userFind.isPresent()){
      return userFind.get();
    }
    return null;
  }

  @GetMapping("/list")
  public List<User> list(){
    return users;
  }
  @PostMapping("/")
  public User user(@RequestBody User user){
    users.add(user);
    return user;
  }
}
