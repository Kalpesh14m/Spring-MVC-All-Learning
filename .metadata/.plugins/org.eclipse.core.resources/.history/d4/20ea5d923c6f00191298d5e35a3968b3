package jbr.springmvc.repo;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jbr.springmvc.model.LoginForm;
import jbr.springmvc.model.User;

@Repository("userDao")
public class UserHibernateImpl implements UserRepository {

  @Autowired
  private SessionFactory sessionFactory;

  public void register(User user) {
    System.out.println("Inside UserHibernateImpl REpo");
    sessionFactory.getCurrentSession().save(user);

  }

  public User validateUser(LoginForm login) {
   return sessionFactory.getCurrentSession()
        .createQuery("select t from User t where t.username= :userName and t.password = :passWord", User.class)
        .setParameter("userName", login.getUsername())
        .setParameter("passWord", login.getPassword())
        .uniqueResult();
   
  }

}
