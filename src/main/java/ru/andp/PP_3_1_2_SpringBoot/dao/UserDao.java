package ru.andp.PP_3_1_2_SpringBoot.dao;


import ru.andp.PP_3_1_2_SpringBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> listUsers();
    void add(User user);
    User getUser(Long id);
    void update(Long id, User user);
    void delete(Long id);
}
