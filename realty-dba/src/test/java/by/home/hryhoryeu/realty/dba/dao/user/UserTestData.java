package by.home.hryhoryeu.realty.dba.dao.user;

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

}
