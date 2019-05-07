package by.home.hryhoryeu.realty.services.role;

import by.home.hryhoryeu.realty.dba.dao.role.IRoleDao;
import by.home.hryhoryeu.realty.entities.enums.Roles;
import by.home.hryhoryeu.realty.entities.model.role.Role;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Scope("singleton")
@Transactional
public class RoleService implements IRoleService {

    private final IRoleDao roleDao;

    public RoleService(IRoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role findByName(Roles role) {
        return roleDao.findByName(role);
    }
}
