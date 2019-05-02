package by.home.hryhoryeu.realty.web.controllers;

import by.home.hryhoryeu.realty.entities.model.user.User;
import by.home.hryhoryeu.realty.services.role.IRoleService;
import by.home.hryhoryeu.realty.services.user.IUserService;
import by.home.hryhoryeu.realty.web.RestApiEndpoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class UserRestService {

    @Autowired
    private IUserService userService;
    @Autowired
    private IRoleService roleService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> registration(@RequestBody User user) {
        return new ResponseEntity<>(userService.setUser(user), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getEmployeeList(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }
}
