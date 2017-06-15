package com.martin.zaposleniciapi.zaposlenici.Controller;

import com.martin.zaposleniciapi.zaposlenici.Data.RoleRepository;
import com.martin.zaposleniciapi.zaposlenici.Data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Martin on 6/15/2017.
 */
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;
}
