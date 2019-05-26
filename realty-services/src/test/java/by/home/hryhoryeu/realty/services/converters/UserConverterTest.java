package by.home.hryhoryeu.realty.services.converters;

import by.home.hryhoryeu.realty.entities.dto.user.UserRegistrationData;
import by.home.hryhoryeu.realty.entities.model.user.User;
import by.home.hryhoryeu.realty.services.user.UserTestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserConverterTest {

    @Test
    void dtoToUserTest() {

        UserRegistrationData registrationData = UserTestData.getRegistrationData();
        UserConverter userConverter = new UserConverter();
        User actualUser = userConverter.dtoToUser(registrationData);
        User expectedUser  = UserTestData.getUser();
        Assertions.assertEquals(expectedUser.getEmail(), actualUser.getEmail());
        Assertions.assertEquals(expectedUser.getName(), actualUser.getName());
        Assertions.assertEquals(expectedUser.getSurname(), actualUser.getSurname());

    }

}
