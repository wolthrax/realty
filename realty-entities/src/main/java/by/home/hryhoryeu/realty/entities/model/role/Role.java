package by.home.hryhoryeu.realty.entities.model.role;

import by.home.hryhoryeu.realty.entities.enums.Roles;
import by.home.hryhoryeu.realty.entities.model.BaseEntity;
import by.home.hryhoryeu.realty.entities.model.user.User;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "value")
    private Roles value;

    @OneToOne(mappedBy = "role", cascade = CascadeType.ALL)
    private User user;

    public Roles getValue() {
        return value;
    }

    public void setValue(Roles value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
