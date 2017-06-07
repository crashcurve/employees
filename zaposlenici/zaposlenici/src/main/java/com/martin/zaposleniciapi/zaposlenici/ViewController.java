package com.martin.zaposleniciapi.zaposlenici;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by i.mihalina on 7.6.2017..
 */
@Controller
public class ViewController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
