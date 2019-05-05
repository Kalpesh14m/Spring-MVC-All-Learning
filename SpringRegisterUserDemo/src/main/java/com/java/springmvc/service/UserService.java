package com.java.springmvc.service;

import com.java.springmvc.model.LoginForm;
import com.java.springmvc.model.User;

public interface UserService {

  void register(User user);

  User validateUser(LoginForm login);
}
