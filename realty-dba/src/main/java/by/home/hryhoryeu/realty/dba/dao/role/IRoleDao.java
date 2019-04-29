package by.home.hryhoryeu.realty.dba.dao.role;

import by.home.hryhoryeu.realty.dba.dao.base.IBaseDao;
import by.home.hryhoryeu.realty.entities.model.role.Role;

public interface IRoleDao extends IBaseDao<Role, Long> {

    Role findByName(String name);

}
