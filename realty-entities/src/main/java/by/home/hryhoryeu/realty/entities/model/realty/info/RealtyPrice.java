package by.home.hryhoryeu.realty.entities.model.realty.info;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "realty_price")
public class RealtyPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "price")
    private BigDecimal price;

    @OneToOne(mappedBy = "realtyPrice", fetch = FetchType.LAZY)
    private RealtyInfo realtyInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public RealtyInfo getRealtyInfo() {
        return realtyInfo;
    }

    public void setRealtyInfo(RealtyInfo realtyInfo) {
        this.realtyInfo = realtyInfo;
    }
}
