package by.home.hryhoryeu.realty.services.converters;

import by.home.hryhoryeu.realty.entities.dto.user.UserRegistrationData;
import by.home.hryhoryeu.realty.entities.model.user.User;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserConverter {

    public User dtoToUser(UserRegistrationData dto) {
        User user = new User();
        user.setLogin(dto.getLogin());
        user.setName(dto.getName());
        user.setSurname(dto.getSurname());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setAdditionalPhone(dto.getAdditionalPhone());
        user.setSkype(dto.getSkype());
        user.setEnabled(true);
        user.setUpdated(new Date());
        return user;
    }

}
