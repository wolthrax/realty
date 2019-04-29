package by.home.hryhoryeu.realty.web.controllers;


import by.home.hryhoryeu.realty.entities.model.role.Role;
import by.home.hryhoryeu.realty.security.dictionary.IDictionaryService;
import by.home.hryhoryeu.realty.security.role.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainPageController {

    @Autowired
    private IDictionaryService dictionaryService;
    @Autowired
    private IRoleService roleService;

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getEmployeeInfo(@PathVariable("id") String id) throws Exception {
        Role role = roleService.findByName("ADMIN_ROLE");
        return new ResponseEntity<>(role, HttpStatus.OK);
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public ResponseEntity<?> getEmployeeInfo() throws Exception {
//
//        Dictionary dictionary = new Dictionary();
//        dictionary.setId(1L);
//        dictionary.setName("Name");
//        return new ResponseEntity<>(dictionary, HttpStatus.OK);
//    }

}
