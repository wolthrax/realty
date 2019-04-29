package by.home.hryhoryeu.realty.dba.dao.user;

import by.home.hryhoryeu.realty.dba.dao.base.BaseDao;
import by.home.hryhoryeu.realty.entities.model.user.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
@Scope("singleton")
public class UserDao extends BaseDao<User, Long> implements IUserDao {

    public User findByLogin(String login) {
        String hql = "FROM User user WHERE user.login =: login";
        Query query = getSession().createQuery(hql);
        query.setParameter("login", login);
        return (User) query.getSingleResult();
    }
}
