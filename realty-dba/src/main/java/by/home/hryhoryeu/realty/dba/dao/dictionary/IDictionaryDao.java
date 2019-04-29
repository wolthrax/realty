package by.home.hryhoryeu.realty.dba.dao.dictionary;

import by.home.hryhoryeu.realty.dba.dao.base.IBaseDao;
import by.home.hryhoryeu.realty.entities.model.dictionary.Dictionary;

import java.util.List;

public interface IDictionaryDao extends IBaseDao<Dictionary, Long> {

    List<Dictionary> findByType(Class clazz);

}
