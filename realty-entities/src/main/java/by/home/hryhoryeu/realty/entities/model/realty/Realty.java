package by.home.hryhoryeu.realty.entities.model.realty;

import by.home.hryhoryeu.realty.entities.model.BaseEntity;
import by.home.hryhoryeu.realty.entities.model.user.User;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "realty")
public class Realty extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
