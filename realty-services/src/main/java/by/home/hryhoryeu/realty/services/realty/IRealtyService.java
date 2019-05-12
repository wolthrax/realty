package by.home.hryhoryeu.realty.services.realty;

import by.home.hryhoryeu.realty.entities.dto.realty.RealtyPreview;
import by.home.hryhoryeu.realty.entities.dto.realty.RealtySearchData;
import by.home.hryhoryeu.realty.entities.dto.realty.RealtyUpdateData;

import java.util.List;

public interface IRealtyService {

    Long setRealty(RealtyUpdateData updateData, List<byte[]> imageList);
    List<RealtyPreview> search(RealtySearchData searchData);

}
