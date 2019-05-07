package by.home.hryhoryeu.realty.entities.enums;

public enum Roles {

    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_USER("ROLE_USER");

    private String role;

    Roles(String columnName) {
        this.role = columnName;
    }

    public String getRole() {
        return role;
    }
}
