package by.home.hryhoryeu.realty.security.role;

import by.home.hryhoryeu.realty.dba.dao.role.IRoleDao;
import by.home.hryhoryeu.realty.entities.model.role.Role;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Scope("singleton")
@Transactional
public class RoleService implements IRoleService {

    private final IRoleDao roleDao;

    public RoleService(IRoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role findByName(String name) {
        return roleDao.findByName(name);
    }
}
