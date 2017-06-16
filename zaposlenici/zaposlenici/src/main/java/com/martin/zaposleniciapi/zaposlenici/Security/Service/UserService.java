package com.martin.zaposleniciapi.zaposlenici.Security.Service;

import com.martin.zaposleniciapi.zaposlenici.Security.Model.User;
import org.springframework.stereotype.Service;

/**
 * Created by i.mihalina on 16.6.2017..
 */

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
