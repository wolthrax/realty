package by.home.hryhoryeu.realty.entities.dto.realty;

import java.math.BigDecimal;

public class RealtyUpdateData {

    private Long id;
    private Long userId;
    private Boolean sale;
    private Long houseTypeId;
    private Long wallMaterialId;
    private Boolean repair;
    private Long parkingTypeId;
    private Integer floor;
    private Integer floorNumber;
    private Boolean kitchenWithWall;
    private Float area;
    private Float livingArea;
    private Float kitchenArea;
    private Float ceilingHeight;
    private Integer year;
    private BigDecimal price;
    private Long currencyId;
    private String description;
    private String coordinates;
    private String address;
    private String phoneTimeFrom;
    private String phoneTimeTo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getSale() {
        return sale;
    }

    public void setSale(Boolean sale) {
        this.sale = sale;
    }

    public Long getHouseTypeId() {
        return houseTypeId;
    }

    public void setHouseTypeId(Long houseTypeId) {
        this.houseTypeId = houseTypeId;
    }

    public Long getWallMaterialId() {
        return wallMaterialId;
    }

    public void setWallMaterialId(Long wallMaterialId) {
        this.wallMaterialId = wallMaterialId;
    }

    public Boolean getRepair() {
        return repair;
    }

    public void setRepair(Boolean repair) {
        this.repair = repair;
    }

    public Long getParkingTypeId() {
        return parkingTypeId;
    }

    public void setParkingTypeId(Long parkingTypeId) {
        this.parkingTypeId = parkingTypeId;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
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
