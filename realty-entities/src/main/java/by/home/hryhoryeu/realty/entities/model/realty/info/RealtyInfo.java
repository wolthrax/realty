package by.home.hryhoryeu.realty.entities.model.realty.info;

import by.home.hryhoryeu.realty.entities.model.dictionary.HouseType;
import by.home.hryhoryeu.realty.entities.model.dictionary.Parking;
import by.home.hryhoryeu.realty.entities.model.dictionary.WallMaterial;
import by.home.hryhoryeu.realty.entities.model.realty.Realty;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "realty_info")
public class RealtyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @OneToOne(mappedBy = "realtyInfo")
    private Realty realty;

    @ManyToOne
    @JoinColumn(name ="house_type_id")
    private HouseType houseType;

    @ManyToOne
    @JoinColumn(name ="wall_material_id")
    private WallMaterial wallMaterial;

    @ManyToOne
    @JoinColumn(name ="parking_id")
    private Parking parking;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "realty_price_id")
    private RealtyPrice realtyPrice;

    @Column(name="sale")
    private Boolean sale;

    @Column(name="repair")
    private Boolean repair;

    @Column(name="floor_number")
    private Integer floorNumber;

    @Column(name="kitchen_with_wall")
    private Boolean kitchenWithWall;

    @Column(name="area")
    private Float area;

    @Column(name="living_area")
    private Float livingArea;

    @Column(name="kitchen_area")
    private Float kitchenArea;

    @Column(name="ceiling_height")
    private Float ceilingHeight;

    @Column(name="year")
    private Integer year;

    @Column(name="description")
    private String description;

    @Column(name="coordinates")
    private String coordinates;

    @Column(name="address")
    private String address;

    @Column(name = "phone_time_from")
    private String phoneTimeFrom;

    @Column(name = "phone_time_to")
    private String phoneTimeTo;

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

    public RealtyPrice getRealtyPrice() {
        return realtyPrice;
    }

    public void setRealtyPrice(RealtyPrice realtyPrice) {
        this.realtyPrice = realtyPrice;
    }

    public Boolean getSale() {
        return sale;
    }

    public void setSale(Boolean sale) {
        this.sale = sale;
    }

    public Boolean getRepair() {
        return repair;
    }

    public void setRepair(Boolean repair) {
        this.repair = repair;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Boolean getKitchenWithWall() {
        return kitchenWithWall;
    }

    public void setKitchenWithWall(Boolean kitchenWithWall) {
        this.kitchenWithWall = kitchenWithWall;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Float getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(Float livingArea) {
        this.livingArea = livingArea;
    }

    public Float getKitchenArea() {
        return kitchenArea;
    }

    public void setKitchenArea(Float kitchenArea) {
        this.kitchenArea = kitchenArea;
    }

    public Float getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(Float ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneTimeFrom() {
        return phoneTimeFrom;
    }

    public void setPhoneTimeFrom(String phoneTimeFrom) {
        this.phoneTimeFrom = phoneTimeFrom;
    }

    public String getPhoneTimeTo() {
        return phoneTimeTo;
    }

    public void setPhoneTimeTo(String phoneTimeTo) {
        this.phoneTimeTo = phoneTimeTo;
    }
}
