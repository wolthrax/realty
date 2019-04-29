package by.home.hryhoryeu.realty.entities.enums;

public enum Roles {

    GUEST("GUEST_ROLE"),
    USER("USER_ROLE"),
    ADMIN("ADMIN_ROLE");

    private String roleName;

    Roles(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
