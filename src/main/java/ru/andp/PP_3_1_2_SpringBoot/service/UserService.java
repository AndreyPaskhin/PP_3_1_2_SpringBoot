package ru.andp.PP_3_1_2_SpringBoot.service;


import ru.andp.PP_3_1_2_SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();
    void add(User user);
    User show(Long id);
    void update(Long id, User user);
    void delete(Long id);
}
