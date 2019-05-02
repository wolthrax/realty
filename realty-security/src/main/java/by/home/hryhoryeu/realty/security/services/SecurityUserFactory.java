package by.home.hryhoryeu.realty.security.services;

import by.home.hryhoryeu.realty.entities.enums.Status;
import by.home.hryhoryeu.realty.entities.model.role.Role;
import by.home.hryhoryeu.realty.entities.model.user.User;
import by.home.hryhoryeu.realty.security.dto.SecurityUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class SecurityUserFactory {

    public SecurityUserFactory() {
    }

    public static SecurityUser create(User user) {
        return new SecurityUser(
                user.getId(),
                user.getLogin(),
                user.getName(),
                user.getSurname(),
                user.getEmail(),
                user.getPassword(),
                user.getStatus().equals(Status.ACTIVE),
                user.getUpdated(),
                mapToGrantedAuthorities(new ArrayList<>(user.getRoles()))
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Role> userRoles) {
        return userRoles.stream()
                .map(role -> (
                    new SimpleGrantedAuthority(role.getValue())
                )).collect(Collectors.toList());
    }
}
