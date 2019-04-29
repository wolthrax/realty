package by.home.hryhoryeu.realty.security.services;

import by.home.hryhoryeu.realty.entities.model.user.User;
import by.home.hryhoryeu.realty.security.user.IUserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserSecurityService implements UserDetailsService {

    private final IUserService userService;

    public UserSecurityService(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userService.findByLogin(login);

        if (user == null) {
            throw new UsernameNotFoundException("User with login " + login + " not found");
        }


        return null;
    }
}
