package ru.andp.PP_3_1_2_SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.andp.PP_3_1_2_SpringBoot.dao.UserDao;
import ru.andp.PP_3_1_2_SpringBoot.model.User;


import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private final UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
    @Transactional(readOnly = false)
    @Override
    public void add(User user) {
        userDao.add(user);
    }
    @Transactional(readOnly = true)
    @Override
    public User show(Long id) {
        return userDao.getUser(id);
    }

    @Transactional(readOnly = false)
    @Override
    public void update(Long id, User user) {
        userDao.update(id, user);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
