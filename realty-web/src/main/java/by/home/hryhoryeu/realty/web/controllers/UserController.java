package by.home.hryhoryeu.realty.web.controllers;

import by.home.hryhoryeu.realty.entities.dto.user.UserRegistrationData;
import by.home.hryhoryeu.realty.services.user.IUserService;
import by.home.hryhoryeu.realty.web.validators.UserValidator;
import by.home.hryhoryeu.realty.web.validators.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private UserValidator validator;

    @RequestMapping(path = "/user/registration", method = RequestMethod.POST)
    public ModelAndView registration(UserRegistrationData userRegistrationData, Model model) {

        ModelAndView modelAndView = new ModelAndView();
        validator.validate(userRegistrationData);

        if (validator.hasErrors()) {
            modelAndView.addObject("errorList", validator.getErrorsMessages());
            modelAndView.setViewName("definition-registration-page");
            return modelAndView;
        } else {
            userService.setUser(userRegistrationData);
            return new ModelAndView("definition-authentication-page");
        }
    }

}
