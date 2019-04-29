package by.home.hryhoryeu.realty.dba.dao.dictionary;

import by.home.hryhoryeu.realty.dba.dao.base.BaseDao;
import by.home.hryhoryeu.realty.entities.model.dictionary.Dictionary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DictionaryDao extends BaseDao<Dictionary, Long> implements IDictionaryDao{

    @Override
    public List<Dictionary> findByType(Class clazz) {
        this.clazz = clazz;
        return findAll();
    }
}
