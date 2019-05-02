package by.home.hryhoryeu.realty.web;

public interface RestApiEndpoints {

    interface PathParam {
        String ID = "/{id}";
    }

    interface Authorization {
        String LOGIN = "/login";
        String LOGOUT = "/logput";
    }

    interface Dictionary {
        String BASE = "/dict";

        String HOUSE_TYPES = "/house-types";
        String STREET_TYPES = "/street-types";
    }

    interface User {
        String BASE = "/user";
    }
}
