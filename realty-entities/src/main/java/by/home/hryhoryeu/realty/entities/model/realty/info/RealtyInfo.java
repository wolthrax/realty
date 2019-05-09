package by.home.hryhoryeu.realty.entities.model.realty.info;

import by.home.hryhoryeu.realty.entities.model.dictionary.Currency;
import by.home.hryhoryeu.realty.entities.model.dictionary.HouseType;
import by.home.hryhoryeu.realty.entities.model.dictionary.Parking;
import by.home.hryhoryeu.realty.entities.model.dictionary.WallMaterial;
import by.home.hryhoryeu.realty.entities.model.realty.Realty;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "realty_info")
public class RealtyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @OneToOne(mappedBy = "realtyInfo", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Realty realty;

    @OneToOne
    @JoinColumn(name ="house_type_id")
    private HouseType houseType;

    @OneToOne
    @JoinColumn(name ="wall_material_id")
    private WallMaterial wallMaterial;

    @OneToOne
    @JoinColumn(name ="parking_id")
    private Parking parking;

    @OneToOne
    @JoinColumn(name ="currency_id")
    private Currency currency;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Realty getRealty() {
        return realty;
    }

    public void setRealty(Realty realty) {
        this.realty = realty;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public WallMaterial getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(WallMaterial wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
