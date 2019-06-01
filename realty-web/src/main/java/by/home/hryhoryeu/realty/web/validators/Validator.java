package by.home.hryhoryeu.realty.web.validators;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    protected Set<String> errorList = new HashSet<>();

    protected boolean checkRegexp(String value, String regex){

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);

        return !matcher.matches();
    }

    public boolean hasErrors() {
        return !errorList.isEmpty();
    }

    public Set<String> getErrorsMessages() {
        return errorList;
    }
}
