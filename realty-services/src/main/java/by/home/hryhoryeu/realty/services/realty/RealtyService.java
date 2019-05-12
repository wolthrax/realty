package by.home.hryhoryeu.realty.services.realty;

import by.home.hryhoryeu.realty.dba.dao.dictionary.IDictionaryDao;
import by.home.hryhoryeu.realty.dba.dao.realty.IRealtyDao;
import by.home.hryhoryeu.realty.dba.filesystem.IImageIO;
import by.home.hryhoryeu.realty.entities.dto.realty.RealtyPreview;
import by.home.hryhoryeu.realty.entities.dto.realty.RealtySearchData;
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
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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

    @Autowired
    private IImageIO imageIO;

    //TODO Scheduler
    private final BigDecimal EXCHANGE_RATES = new BigDecimal(2.1090);

    @Override
    public Long setRealty(RealtyUpdateData updateData, List<byte[]> imageList) {

        Realty realty = new Realty();
        realty.setCreatedDate(new Date());
        RealtyInfo realtyInfo = new RealtyInfo();
        List<String> imagePathList = new ArrayList<>();
        String path = "\\" + updateData.getUserId() + "\\" + UUID.randomUUID();

        for (int i = 0; i < imageList.size(); i++) {
            imagePathList.add(imageIO.save(imageList.get(i), path, "\\" + i + ".jpg"));
        }

        List<RealtyPhoto> realtyPhotoList = new ArrayList<>();
        for (String imagePath : imagePathList) {
            RealtyPhoto realtyPhoto = new RealtyPhoto();
            realtyPhoto.setImagePath(imagePath);
            realtyPhoto.setRealty(realty);
            realtyPhotoList.add(realtyPhoto);
        }

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
            realtyPrice.setPrice(updateData.getPrice().multiply(EXCHANGE_RATES));
        }
        realtyInfo.setRealtyPrice(realtyPrice);

        realtyInfo.setSale(updateData.getSale());
        realtyInfo.setRepair(updateData.getRepair());
        realtyInfo.setFloor(updateData.getFloor());
        realtyInfo.setFloorNumber(updateData.getFloorNumber());
        realtyInfo.setRooms(updateData.getRooms());
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
        realty.setRealtyPhotoList(realtyPhotoList);
        realty.setRealtyInfo(realtyInfo);
        return realtyDao.set(realty);
    }

    @Override
    public List<RealtyPreview> search(RealtySearchData searchData) {

        List<Realty> realtyList = realtyDao.search(searchData);
        List<RealtyPreview> realtyPreviewList = new ArrayList<>();

        for (Realty realty : realtyList) {
            RealtyPreview realtyPreview = new RealtyPreview();
            realtyPreview.setRealtyPriceUSD(realty.getRealtyInfo().getRealtyPrice().getPrice().multiply(EXCHANGE_RATES));
            realtyPreview.setRealtyPriceBYN(realty.getRealtyInfo().getRealtyPrice().getPrice());
            realtyPreview.setFloorNumberStr(realty.getRealtyInfo().getFloor().toString() +
                    "/" + realty.getRealtyInfo().getFloorNumber().toString());
            realtyPreview.setFullAreaStr(realty.getRealtyInfo().getArea().toString() +
                    "/" + realty.getRealtyInfo().getLivingArea().toString() +
                    "/" + realty.getRealtyInfo().getKitchenArea().toString());
            realtyPreview.setCoordinates(realty.getRealtyInfo().getCoordinates());
            realtyPreview.setAddress(realty.getRealtyInfo().getAddress());
            realtyPreview.setRooms(realty.getRealtyInfo().getRooms());
            realtyPreview.setPreviewImage(Base64.getEncoder().encodeToString(imageIO.read(realty.getRealtyPhotoList().get(0).getImagePath())));
            realtyPreviewList.add(realtyPreview);
        }
        return realtyPreviewList;
    }
}
