package by.home.hryhoryeu.realty.dba.dao.user;

import by.home.hryhoryeu.realty.dba.dao.base.BaseDao;
import by.home.hryhoryeu.realty.entities.model.user.User;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;



@Repository
@Scope("singleton")
public class UserDao extends BaseDao<User, Long> implements IUserDao {

    public UserDao() {
        super(User.class);
    }

    public User findByLogin(String login) {
        String hql = "FROM User user WHERE user.login =: login";
        Query query = getSession().createQuery(hql);
        query.setParameter("login", login);
        return (User) query.uniqueResult();
    }
}
