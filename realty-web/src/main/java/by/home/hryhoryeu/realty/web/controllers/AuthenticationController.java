package by.home.hryhoryeu.realty.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class AuthenticationController {

    @RequestMapping(path = "/login",method = RequestMethod.GET)
    public ModelAndView loginPage(Model model) {
        return new ModelAndView("definition-authentication-page");
    }

    @RequestMapping(path = "/registration", method = RequestMethod.GET)
    public ModelAndView registration(Model model) {
        return new ModelAndView("definition-registration-page");
    }


}
