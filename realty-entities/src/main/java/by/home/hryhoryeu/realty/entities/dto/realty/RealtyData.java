package by.home.hryhoryeu.realty.entities.dto.realty;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class RealtyData {

    private String login;
    private String username;
    private String surname;
    private Date createdDate;
    private String houseType;
    private String wallMaterial;
    private String parking;
    private BigDecimal realtyPrice;
    private Boolean sale;
    private Boolean repair;
    private Integer floorNumber;
    private Boolean kitchenWithWall;
    private Float area;
    private Float livingArea;
    private Float kitchenArea;
    private Float ceilingHeight;
    private Integer year;
    private String description;
    private String coordinates;
    private String address;
    private String phoneTimeFrom;
    private String phoneTimeTo;
    private List<byte[]> images;
    private byte[] previewImage;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public BigDecimal getRealtyPrice() {
        return realtyPrice;
    }

    public void setRealtyPrice(BigDecimal realtyPrice) {
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

    public List<byte[]> getImages() {
        return images;
    }

    public void setImages(List<byte[]> images) {
        this.images = images;
    }

    public byte[] getPreviewImage() {
        return previewImage;
    }

    public void setPreviewImage(byte[] previewImage) {
        this.previewImage = previewImage;
    }
}
