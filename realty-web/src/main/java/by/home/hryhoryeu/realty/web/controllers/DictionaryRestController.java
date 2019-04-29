package by.home.hryhoryeu.realty.web.controllers;

import by.home.hryhoryeu.realty.entities.model.dictionary.HouseType;
import by.home.hryhoryeu.realty.entities.model.dictionary.StreetType;
import by.home.hryhoryeu.realty.security.dictionary.IDictionaryService;
import by.home.hryhoryeu.realty.web.RestApiEndpoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestApiEndpoints.Dictionary.BASE)
public class DictionaryRestController {

    private final IDictionaryService dictionaryService;

    @Autowired
    public DictionaryRestController(IDictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @RequestMapping(path = RestApiEndpoints.Dictionary.HOUSE_TYPES, method = RequestMethod.GET)
    public ResponseEntity<?> getHouseTypes() {
        return new ResponseEntity<>(dictionaryService.findAll(HouseType.class), HttpStatus.OK);
    }

    @RequestMapping(path = RestApiEndpoints.Dictionary.STREET_TYPES, method = RequestMethod.GET)
    public ResponseEntity<?> getStreetTypes() {
        return new ResponseEntity<>(dictionaryService.findAll(StreetType.class), HttpStatus.OK);
    }

}
