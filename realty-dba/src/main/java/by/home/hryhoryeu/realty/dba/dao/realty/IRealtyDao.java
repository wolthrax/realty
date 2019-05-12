package by.home.hryhoryeu.realty.dba.dao.realty;

import by.home.hryhoryeu.realty.dba.dao.base.IBaseDao;
import by.home.hryhoryeu.realty.entities.dto.realty.RealtySearchData;
import by.home.hryhoryeu.realty.entities.model.realty.Realty;

import java.util.List;

public interface IRealtyDao extends IBaseDao<Realty, Long> {

    List<Realty> search(RealtySearchData searchData);

}
