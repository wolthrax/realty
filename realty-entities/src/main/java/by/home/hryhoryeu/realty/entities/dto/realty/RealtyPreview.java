package by.home.hryhoryeu.realty.entities.dto.realty;

import java.math.BigDecimal;

public class RealtyPreview {

    private BigDecimal realtyPriceBYN;
    private BigDecimal realtyPriceUSD;
    private String floorNumberStr;
    private String fullAreaStr;
    private String coordinates;
    private String address;
    private String  previewImage;
    private Integer rooms;

    public BigDecimal getRealtyPriceBYN() {
        return realtyPriceBYN;
    }

    public void setRealtyPriceBYN(BigDecimal realtyPriceBYN) {
        this.realtyPriceBYN = realtyPriceBYN;
    }

    public BigDecimal getRealtyPriceUSD() {
        return realtyPriceUSD;
    }

    public void setRealtyPriceUSD(BigDecimal realtyPriceUSD) {
        this.realtyPriceUSD = realtyPriceUSD;
    }

    public String getFloorNumberStr() {
        return floorNumberStr;
    }

    public void setFloorNumberStr(String floorNumberStr) {
        this.floorNumberStr = floorNumberStr;
    }

    public String getFullAreaStr() {
        return fullAreaStr;
    }

    public void setFullAreaStr(String fullAreaStr) {
        this.fullAreaStr = fullAreaStr;
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

    public String getPreviewImage() {
        return previewImage;
    }

    public void setPreviewImage(String previewImage) {
        this.previewImage = previewImage;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }
}
