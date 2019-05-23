package by.home.hryhoryeu.realty.services.user;

import by.home.hryhoryeu.realty.entities.dto.user.UserRegistrationData;
import by.home.hryhoryeu.realty.entities.model.user.User;

import java.util.List;

public interface IUserService {

    Long setUser(UserRegistrationData userRegistrationData);
    List<User> findAll();
    User findById(Long id);
    User findByLogin(String login);
}
