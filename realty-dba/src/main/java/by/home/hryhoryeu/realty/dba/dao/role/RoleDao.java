package by.home.hryhoryeu.realty.dba.dao.role;

import by.home.hryhoryeu.realty.dba.dao.base.BaseDao;
import by.home.hryhoryeu.realty.entities.model.role.Role;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
@Scope("singleton")
public class RoleDao extends BaseDao<Role, Long> implements IRoleDao {

    public RoleDao() {
        super();
    }

    @Override
    public Role findByName(String name) {
        String hql = "FROM Role role WHERE role.value =: name";
        Query query = getSession().createQuery(hql);
        query.setParameter("name", name);
        return (Role) query.getSingleResult();
    }
}
