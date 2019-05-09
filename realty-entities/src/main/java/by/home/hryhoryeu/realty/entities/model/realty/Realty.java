package by.home.hryhoryeu.realty.entities.model.realty;

import by.home.hryhoryeu.realty.entities.model.BaseEntity;
import by.home.hryhoryeu.realty.entities.model.realty.info.RealtyInfo;
import by.home.hryhoryeu.realty.entities.model.user.User;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "realty")
public class Realty extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "realty_info_id")
    private RealtyInfo realtyInfo;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RealtyInfo getRealtyInfo() {
        return realtyInfo;
    }

    public void setRealtyInfo(RealtyInfo realtyInfo) {
        this.realtyInfo = realtyInfo;
    }
}
