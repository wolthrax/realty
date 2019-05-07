package by.home.hryhoryeu.realty.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/realty")
public class RealtyController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView registrationUser(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("definition-main-page");
        return modelAndView;
    }
}
