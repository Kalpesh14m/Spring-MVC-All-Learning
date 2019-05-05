package jbr.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jbr.springmvc.model.LoginForm;
import jbr.springmvc.model.User;
import jbr.springmvc.repo.UserRepository;

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
