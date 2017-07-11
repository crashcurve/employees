package io.ecx.employee.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import io.ecx.employee.model.User;
import io.ecx.employee.service.UserService;

/**
 * Created by i.mihalina on 16.6.2017..
 */
@Controller
public class LoginController
{

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult)
    {
        final ModelAndView modelAndView = new ModelAndView();
        final User userExists = userService.findUserByEmail(user.getEmail());
        if (userExists != null)
        {
            bindingResult.rejectValue("email", "error.user", "There is already a user registered with the email provided");
        }
        if (bindingResult.hasErrors())
        {
            modelAndView.setViewName("registration");
        }
        else
        {
            userService.saveUser(user);
            modelAndView.addObject("successMessage", "User has been registered successfully");
            modelAndView.addObject("user", new User());
            modelAndView.setViewName("registration");

        }
        return modelAndView;
    }

    @RequestMapping(value = { "/", "/login" }, method = RequestMethod.GET)
    public ModelAndView login()
    {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView registration()
    {
        final ModelAndView modelAndView = new ModelAndView();
        final User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("registration");
        return modelAndView;
    }

}
