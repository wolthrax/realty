package by.home.hryhoryeu.realty.services.user;

import by.home.hryhoryeu.realty.entities.dto.user.UserRegistrationData;
import by.home.hryhoryeu.realty.entities.model.user.User;

public class UserTestData {

    public static User getUser() {
        User user = new User();
        user.setId(1L);
        user.setAdditionalPhone("8814281");
        user.setEmail("wolthrax@gmail.com");
        user.setEnabled(true);
        user.setName("maxim");
        user.setLogin("maxim");
        user.setPassword("qwerty");
        user.setPhone("8814281");
        user.setSkype("wolthrax");
        user.setSurname("hryhoryeu");
        return user;
    }

    public static UserRegistrationData getRegistrationData() {
        UserRegistrationData registrationData = new UserRegistrationData();
        registrationData.setAdditionalPhone("8814281");
        registrationData.setEmail("wolthrax@gmail.com");
        registrationData.setName("maxim");
        registrationData.setLogin("maxim");
        registrationData.setPassword1("qwerty");
        registrationData.setPassword2("qwerty");
        registrationData.setPhone("8814281");
        registrationData.setSkype("wolthrax");
        registrationData.setSurname("hryhoryeu");
        registrationData.setDayOfBirth("1992-06-19");

        return registrationData;
    }
}
