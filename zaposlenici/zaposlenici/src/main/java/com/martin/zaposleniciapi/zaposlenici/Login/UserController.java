package com.martin.zaposleniciapi.zaposlenici.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by i.mihalina on 12.6.2017..
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping
    public String viewUserProfile() {
        return "user/profile";
    }
}
