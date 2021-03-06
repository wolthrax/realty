package by.home.hryhoryeu.realty.entities.model.dictionary;

import by.home.hryhoryeu.realty.entities.model.realty.info.RealtyInfo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "house_type")
public class HouseType extends Dictionary{

    @OneToMany(mappedBy = "houseType", fetch = FetchType.LAZY)
    private List<RealtyInfo> realtyInfo;

    public List<RealtyInfo> getRealtyInfo() {
        return realtyInfo;
    }

    public void setRealtyInfo(List<RealtyInfo> realtyInfo) {
        this.realtyInfo = realtyInfo;
    }
}
