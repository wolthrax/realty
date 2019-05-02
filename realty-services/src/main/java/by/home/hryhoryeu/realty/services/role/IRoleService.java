package by.home.hryhoryeu.realty.services.role;

import by.home.hryhoryeu.realty.entities.model.role.Role;

import java.util.List;

public interface IRoleService {

    Role findByName(String name);
    List<Role> roles();

}
