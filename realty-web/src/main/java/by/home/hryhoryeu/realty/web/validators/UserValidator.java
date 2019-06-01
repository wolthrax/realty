package by.home.hryhoryeu.realty.web.validators;

import by.home.hryhoryeu.realty.entities.dto.user.UserRegistrationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:regexp.properties" })
public class UserValidator extends Validator{

    @Autowired
    private Environment environment;

    public void validate(UserRegistrationData registrationData){

        errorList.clear();

        if (registrationData.getLogin() != null) {
            if (checkRegexp(registrationData.getLogin(), environment.getProperty("regexp.user.login")) &&
                    registrationData.getLogin() != null) {
                errorList.add("lang.error.incorrect.login");
            }
        } else errorList.add("lang.error.empty.login");

        if (registrationData.getName() != null) {
            if (checkRegexp(registrationData.getName(), environment.getProperty("regexp.user.base_str")) &&
                    registrationData.getLogin() != null) {
                errorList.add("lang.error.incorrect.name");
            }
        } else errorList.add("lang.error.empty.name");

        if (registrationData.getSurname() != null) {
            if (checkRegexp(registrationData.getName(), environment.getProperty("regexp.user.base_str")) &&
                    registrationData.getLogin() != null) {
                errorList.add("lang.error.incorrect.surname");
            }
        } else errorList.add("lang.error.empty.surname");

        if (registrationData.getEmail() != null) {
            if (checkRegexp(registrationData.getEmail(), environment.getProperty("regexp.user.email")) &&
                    registrationData.getLogin() != null) {
                errorList.add("lang.error.incorrect.email");
            }
        } else errorList.add("lang.error.empty.email");

        if (registrationData.getPhone() != null) {
            if (checkRegexp(registrationData.getPhone(), environment.getProperty("regexp.user.phone")) &&
                    registrationData.getLogin() != null) {
                errorList.add("lang.error.incorrect.phone");
            }
        } else errorList.add("lang.error.empty.phone");

        if (registrationData.getPassword1() != null) {
            if (checkRegexp(registrationData.getPassword1(), environment.getProperty("regexp.user.password")) &&
                    registrationData.getLogin() != null) {
                errorList.add("lang.error.incorrect.password");
            } else {
                if (!registrationData.getPassword1().equals(registrationData.getPassword2()) ||
                        registrationData.getPassword2() == null) {
                    errorList.add("lang.error.match.password");
                }
            }
        } else errorList.add("lang.error.empty.password");
    }




}
