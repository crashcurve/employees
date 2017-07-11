package io.ecx.employee.service;

import io.ecx.employee.model.User;

/**
 * Created by i.mihalina on 16.6.2017..
 */

public interface UserService
{
    public User findUserByEmail(String email);

    public void saveUser(User user);
}
