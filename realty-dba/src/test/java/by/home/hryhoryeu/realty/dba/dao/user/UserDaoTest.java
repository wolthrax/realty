package by.home.hryhoryeu.realty.dba.dao.user;

import by.home.hryhoryeu.realty.entities.model.user.User;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

@ExtendWith(SpringExtension.class)
@Transactional
@ContextConfiguration({"classpath:service-config-test.xml" })
public class UserDaoTest {

    @Autowired
    private IUserDao userDao;

    @Test
    void getUserByIdTest() {
        User user1 = userDao.findById(1L);
        User user2 = UserTestData.getUser();
        Assertions.assertEquals(user1, user2);
    }

    @Test
    void setUser() {
        Long expectedId = 2L;
        User user = UserTestData.getUser();
        Long actualId = userDao.set(user);
        userDao.set(user);
        Assertions.assertEquals(expectedId, actualId);
    }

    @Test
    void updateUser() {
        Long expectedId = 1L;

        User expectedUserData = userDao.findById(expectedId);
        expectedUserData.setLogin("asdf");
        expectedUserData.setSkype("Skype123");
        userDao.update(expectedUserData);
        User actualUserData = userDao.findById(expectedId);

        Assertions.assertEquals(expectedUserData, actualUserData);
    }

    @Test
    void findByLoginUser() {
        String userLogin = "maxim";
        User expectedUserData = UserTestData.getUser();
        User actualUserData = userDao.findByLogin(userLogin);

        Assertions.assertEquals(expectedUserData, actualUserData);
    }
}