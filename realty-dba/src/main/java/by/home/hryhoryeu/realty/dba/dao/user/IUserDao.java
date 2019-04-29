package by.home.hryhoryeu.realty.dba.dao.user;

import by.home.hryhoryeu.realty.dba.dao.base.IBaseDao;
import by.home.hryhoryeu.realty.entities.model.user.User;

public interface IUserDao extends IBaseDao<User, Long> {

    User findByLogin(String login);

}
