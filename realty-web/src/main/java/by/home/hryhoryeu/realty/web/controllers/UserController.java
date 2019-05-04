package by.home.hryhoryeu.realty.web.controllers;

import by.home.hryhoryeu.realty.entities.model.role.Role;
import by.home.hryhoryeu.realty.services.role.IRoleService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    private IRoleService roleService;
    private static final Logger LOG = LogManager.getLogger(UserController.class);

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView registrationUser(Model model) {

        Role role = roleService.findByName("ROLE_ADMIN");
        LOG.info(role.getId() + " : " + role.getValue());


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("definition-main-page");
        return modelAndView;
    }

}
