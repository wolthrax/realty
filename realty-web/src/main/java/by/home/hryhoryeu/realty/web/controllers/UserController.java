package by.home.hryhoryeu.realty.web.controllers;

import by.home.hryhoryeu.realty.entities.dto.UserDto;
import by.home.hryhoryeu.realty.services.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(path = "/registration", method = RequestMethod.POST)
    public ModelAndView registration(UserDto userDto, Model model) {
        return new ModelAndView("definition-authentication-page");
    }

}
