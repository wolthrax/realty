package by.home.hryhoryeu.realty.entities.model.realty;

import by.home.hryhoryeu.realty.entities.model.BaseEntity;
import by.home.hryhoryeu.realty.entities.model.realty.info.RealtyInfo;
import by.home.hryhoryeu.realty.entities.model.realty.info.RealtyPhoto;
import by.home.hryhoryeu.realty.entities.model.user.User;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "realty")
public class Realty extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "realty_info_id")
    private RealtyInfo realtyInfo;

    @OneToMany(mappedBy = "realty", cascade = CascadeType.ALL)
    private List<RealtyPhoto> realtyPhotoList;

    @Column(name = "created_date")
    private Date createdDate;

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

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

    public List<RealtyPhoto> getRealtyPhotoList() {
        return realtyPhotoList;
    }

    public void setRealtyPhotoList(List<RealtyPhoto> realtyPhotoList) {
        this.realtyPhotoList = realtyPhotoList;
    }
}
