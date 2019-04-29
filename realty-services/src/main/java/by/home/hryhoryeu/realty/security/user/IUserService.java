package by.home.hryhoryeu.realty.security.user;

import by.home.hryhoryeu.realty.entities.model.user.User;

import java.util.List;

public interface IUserService {

    Long setUser(User user);
    List<User> findAll();
    User findById(Long id);
    User findByLogin(String login);
}
