package by.home.hryhoryeu.realty.entities.dto.realty;

import java.math.BigDecimal;

public class RealtySearchData {

    private BigDecimal priceFrom;
    private BigDecimal privateTo;
    private Float areaFrom;
    private Float areaTo;
    private Long houseType;
    private Integer yearFrom;
    private Integer yearTo;
    private Long wallMaterial;
    private String address;
    private Integer rooms;

    public BigDecimal getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(BigDecimal priceFrom) {
        this.priceFrom = priceFrom;
    }

    public BigDecimal getPrivateTo() {
        return privateTo;
    }

    public void setPrivateTo(BigDecimal privateTo) {
        this.privateTo = privateTo;
    }

    public Float getAreaFrom() {
        return areaFrom;
    }

    public void setAreaFrom(Float areaFrom) {
        this.areaFrom = areaFrom;
    }

    public Float getAreaTo() {
        return areaTo;
    }

    public void setAreaTo(Float areaTo) {
        this.areaTo = areaTo;
    }

    public Long getHouseType() {
        return houseType;
    }

    public void setHouseType(Long houseType) {
        this.houseType = houseType;
    }

    public Integer getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(Integer yearFrom) {
        this.yearFrom = yearFrom;
    }

    public Integer getYearTo() {
        return yearTo;
    }

    public void setYearTo(Integer yearTo) {
        this.yearTo = yearTo;
    }

    public Long getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(Long wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }
}
