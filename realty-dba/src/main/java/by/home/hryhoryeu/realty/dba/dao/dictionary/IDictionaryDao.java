package by.home.hryhoryeu.realty.dba.dao.dictionary;

import by.home.hryhoryeu.realty.dba.dao.base.IBaseDao;
import by.home.hryhoryeu.realty.entities.pojo.dictionary.HouseType;

import java.util.List;


public interface IDictionaryDao extends IBaseDao<HouseType, Long> {

    List get1(Long param);

}
