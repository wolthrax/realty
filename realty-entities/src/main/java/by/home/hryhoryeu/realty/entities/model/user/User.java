package by.home.hryhoryeu.realty.entities.model.user;

import by.home.hryhoryeu.realty.entities.model.BaseEntity;
import by.home.hryhoryeu.realty.entities.model.role.Role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(name = "login")
    private String login;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="additional_phone")
    private String additionalPhone;

    @Column(name="skype")
    private String skype;

    @Column(name="day_of_birth")
    private Date dayOfBirth;

    @Column(name="password")
    private String password;

    @Column(name = "enabled")
    private Boolean enabled;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "updated")
    private Date updated;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdditionalPhone() {
        return additionalPhone;
    }

    public void setAdditionalPhone(String additionalPhone) {
        this.additionalPhone = additionalPhone;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

//    public List<Realty> getRealtyList() {
//        return realtyList;
//    }
//
//    public void setRealtyList(List<Realty> realtyList) {
//        this.realtyList = realtyList;
//    }

//    public List<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<Role> roles) {
//        this.roles = roles;
//    }


    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(email, user.email) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(additionalPhone, user.additionalPhone) &&
                Objects.equals(skype, user.skype) &&
                Objects.equals(dayOfBirth, user.dayOfBirth) &&
                Objects.equals(password, user.password) &&
                Objects.equals(enabled, user.enabled) &&
                Objects.equals(role, user.role) &&
                Objects.equals(updated, user.updated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, name, surname, email, phone, additionalPhone, skype, dayOfBirth, password, enabled, role, updated);
    }
}
