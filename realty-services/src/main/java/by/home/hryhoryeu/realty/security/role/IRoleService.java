package by.home.hryhoryeu.realty.security.role;

import by.home.hryhoryeu.realty.entities.model.role.Role;

public interface IRoleService {

    Role findByName(String name);

}
