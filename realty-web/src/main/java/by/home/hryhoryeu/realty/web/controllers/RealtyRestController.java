package by.home.hryhoryeu.realty.web.controllers;

import by.home.hryhoryeu.realty.entities.model.role.Role;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/realty")
public class RealtyRestController {

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public ResponseEntity<?> get() {
        Role r = new Role();
        r.setId(1L);
        return new ResponseEntity<>(r, HttpStatus.OK);
    }

}
