package by.home.hryhoryeu.realty.entities.model.dictionary;

import by.home.hryhoryeu.realty.entities.model.realty.info.RealtyInfo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parking")
public class Parking extends Dictionary {

    @OneToOne(mappedBy = "parking", fetch = FetchType.LAZY)
    private RealtyInfo realtyInfo;

    public RealtyInfo getRealtyInfo() {
        return realtyInfo;
    }

    public void setRealtyInfo(RealtyInfo realtyInfo) {
        this.realtyInfo = realtyInfo;
    }

}