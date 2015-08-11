package cn.net.vive.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by robin on 2015/8/10.
 */
@RestController
public class LoginController {
    @RequestMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }
}
