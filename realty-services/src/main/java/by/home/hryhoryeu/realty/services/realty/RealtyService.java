package by.home.hryhoryeu.realty.services.realty;

import by.home.hryhoryeu.realty.dba.dao.dictionary.IDictionaryDao;
import by.home.hryhoryeu.realty.dba.dao.realty.IRealtyDao;
import by.home.hryhoryeu.realty.entities.dto.realty.RealtyUpdateData;
import by.home.hryhoryeu.realty.entities.model.dictionary.Currency;
import by.home.hryhoryeu.realty.entities.model.dictionary.HouseType;
import by.home.hryhoryeu.realty.entities.model.dictionary.Parking;
import by.home.hryhoryeu.realty.entities.model.dictionary.WallMaterial;
import by.home.hryhoryeu.realty.entities.model.realty.Realty;
import by.home.hryhoryeu.realty.entities.model.realty.info.RealtyInfo;
import by.home.hryhoryeu.realty.entities.model.realty.info.RealtyPhoto;
import by.home.hryhoryeu.realty.entities.model.realty.info.RealtyPrice;
import by.home.hryhoryeu.realty.services.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

@Service
@Scope("singleton")
@Transactional
public class RealtyService implements IRealtyService {

    @Autowired
    private IRealtyDao realtyDao;

    @Autowired
    private IDictionaryDao dictionaryDao;

    @Autowired
    private IUserService userService;

    //TODO Scheduler
    private final BigDecimal EXCHANGE_RATES = new BigDecimal(2);

    @Override
    public Long setRealty(RealtyUpdateData updateData) {

        Realty realty = new Realty();
        realty.setCreatedDate(new Date());
        RealtyInfo realtyInfo = new RealtyInfo();
        //RealtyPhoto realtyPhoto = new RealtyPhoto();

        HouseType houseType = (HouseType) dictionaryDao.findById(HouseType.class, updateData.getHouseTypeId());
        realtyInfo.setHouseType(houseType);

        WallMaterial wallMaterial = (WallMaterial) dictionaryDao.findById(WallMaterial.class, updateData.getWallMaterialId());
        realtyInfo.setWallMaterial(wallMaterial);

        Parking parking = (Parking) dictionaryDao.findById(Parking.class, updateData.getParkingTypeId());
        realtyInfo.setParking(parking);

        RealtyPrice realtyPrice = new RealtyPrice();
        Currency currency = (Currency) dictionaryDao.findById(Currency.class, updateData.getCurrencyId());
        if (currency.getValueEn().equals("BYN")) {
            realtyPrice.setPrice(updateData.getPrice());
        } else {
            realtyPrice.setPrice(updateData.getPrice().divide(EXCHANGE_RATES));
        }
        realtyInfo.setRealtyPrice(realtyPrice);

        realtyInfo.setSale(updateData.getSale());
        realtyInfo.setRepair(updateData.getRepair());
        realtyInfo.setFloorNumber(updateData.getFloorNumber());
        realtyInfo.setKitchenWithWall(updateData.getKitchenWithWall());
        realtyInfo.setArea(updateData.getArea());
        realtyInfo.setLivingArea(updateData.getLivingArea());
        realtyInfo.setKitchenArea(updateData.getKitchenArea());
        realtyInfo.setCeilingHeight(updateData.getCeilingHeight());
        realtyInfo.setYear(updateData.getYear());
        realtyInfo.setDescription(updateData.getDescription());
        realtyInfo.setCoordinates(updateData.getCoordinates());
        realtyInfo.setAddress(updateData.getAddress());
        realtyInfo.setPhoneTimeFrom(updateData.getPhoneTimeFrom());
        realtyInfo.setPhoneTimeTo(updateData.getPhoneTimeTo());

        realty.setUser(userService.findById(updateData.getUserId()));
        realty.setRealtyInfo(realtyInfo);
        return realtyDao.set(realty);
    }
}
