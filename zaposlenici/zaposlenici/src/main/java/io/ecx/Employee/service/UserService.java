package io.ecx.Employee.service;

import io.ecx.Employee.model.User;

/**
 * Created by i.mihalina on 16.6.2017..
 */

public interface UserService
{
    public User findUserByEmail(String email);

    public void saveUser(User user);
}
