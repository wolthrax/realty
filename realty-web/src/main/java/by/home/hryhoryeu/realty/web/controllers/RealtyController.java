package by.home.hryhoryeu.realty.web.controllers;

import by.home.hryhoryeu.realty.entities.dto.DictionaryDto;
import by.home.hryhoryeu.realty.entities.dto.realty.RealtyUpdateData;
import by.home.hryhoryeu.realty.entities.model.dictionary.Currency;
import by.home.hryhoryeu.realty.entities.model.dictionary.HouseType;
import by.home.hryhoryeu.realty.entities.model.dictionary.Parking;
import by.home.hryhoryeu.realty.entities.model.dictionary.WallMaterial;
import by.home.hryhoryeu.realty.services.dictionary.IDictionaryService;
import by.home.hryhoryeu.realty.services.realty.IRealtyService;
import by.home.hryhoryeu.realty.services.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/realty")
public class RealtyController {

    @Autowired
    private IRealtyService realtyService;
    @Autowired
    private IDictionaryService dictionaryService;
    @Autowired
    private IUserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView registrationUser(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        if (name != null && !name.isEmpty()) {
            modelAndView.addObject("userName", name);
        }
        modelAndView.setViewName("definition-main-page");
        return modelAndView;
    }

    @RequestMapping(path = "/add", method = RequestMethod.GET)
    public ModelAndView addRealtyView(@RequestParam("lang") String lang) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("definition-realty-add-page");

        List<DictionaryDto> houseTypeList = dictionaryService.findAll(HouseType.class, lang);
        List<DictionaryDto> parkingTypeList = dictionaryService.findAll(Parking.class, lang);
        List<DictionaryDto> wallMaterialList = dictionaryService.findAll(WallMaterial.class, lang);
        List<DictionaryDto> currencyList = dictionaryService.findAll(Currency.class, lang);

        modelAndView.addObject("houseTypeList", houseTypeList);
        modelAndView.addObject("parkingTypeList", parkingTypeList);
        modelAndView.addObject("wallMaterialList", wallMaterialList);
        modelAndView.addObject("currencyList", currencyList);

        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        if (name != null && !name.isEmpty()) {
            modelAndView.addObject("userName", name);
        }
        return modelAndView;
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public ModelAndView saveRealty(@ModelAttribute RealtyUpdateData updateData, Model model) {

        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        updateData.setUserId(userService.findByLogin(name).getId());
        realtyService.setRealty(updateData);

        ModelAndView modelAndView = new ModelAndView("definition-main-page");
        return modelAndView;
    }
}
