package by.home.hryhoryeu.realty.dba.dao.role;

import by.home.hryhoryeu.realty.dba.dao.base.BaseDao;
import by.home.hryhoryeu.realty.entities.enums.Roles;
import by.home.hryhoryeu.realty.entities.model.role.Role;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
@Scope("singleton")
public class RoleDao extends BaseDao<Role, Long> implements IRoleDao {

    public RoleDao() {
        super(Role.class);
    }

    @Override
    public Role findByName(Roles roles) {
        String hql = "FROM Role role WHERE role.value =: name";
        Query query = getSession().createQuery(hql);
        query.setParameter("name", roles);
        return (Role) query.getSingleResult();
    }
}
