package by.home.hryhoryeu.realty.services.converters;

import by.home.hryhoryeu.realty.entities.dto.UserDto;
import by.home.hryhoryeu.realty.entities.model.user.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public User dtoToUser(UserDto dto) {
        User user = new User();
        user.setLogin(dto.getLogin());
        user.setName(dto.getName());
        user.setSurname(dto.getSurname());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setAdditionalPhone(dto.getAdditionalPhone());
        user.setPassword(dto.getPassword1());
        return user;
    }

}
