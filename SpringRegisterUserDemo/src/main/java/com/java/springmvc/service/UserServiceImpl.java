package com.java.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.springmvc.model.LoginForm;
import com.java.springmvc.model.User;
import com.java.springmvc.repo.UserRepository;



@Service("userService")
public class UserServiceImpl implements UserService {

  @Autowired
  public UserRepository userDao;

  @Transactional
  public void register(User user) {
    userDao.register(user);
  }

  @Transactional
  public User validateUser(LoginForm login) {
    return userDao.validateUser(login);
  }

}
