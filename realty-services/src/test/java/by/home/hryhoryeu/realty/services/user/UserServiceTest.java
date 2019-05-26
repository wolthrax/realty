package by.home.hryhoryeu.realty.services.user;

import by.home.hryhoryeu.realty.entities.dto.user.UserRegistrationData;
import by.home.hryhoryeu.realty.entities.model.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration({"classpath:service-config-test.xml" })
public class UserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    void getUserByIdTest() {
        User user1 = userService.findById(1L);
        User user2 = UserTestData.getUser();
        Assertions.assertEquals(user1, user2);
    }

    @Test
    void registrationUserTest() {
        Long expectedId = 2L;
        UserRegistrationData registrationData = UserTestData.getRegistrationData();
        registrationData.setLogin("asdf");
        Long actualId = userService.setUser(registrationData);

        Assertions.assertEquals(expectedId, actualId);
    }

    @Test
    void findByLoginUser() {
        String userLogin = "maxim";
        User expectedUserData = UserTestData.getUser();
        User actualUserData = userService.findByLogin(userLogin);

        Assertions.assertEquals(expectedUserData, actualUserData);
    }

}