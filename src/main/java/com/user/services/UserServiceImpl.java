package com.user.services;

import com.user.dao.UserDAO;
import com.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDAO userDAO;

   @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }
}
