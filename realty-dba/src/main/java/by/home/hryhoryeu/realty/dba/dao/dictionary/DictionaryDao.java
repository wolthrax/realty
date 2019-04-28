package by.home.hryhoryeu.realty.dba.dao.dictionary;


import by.home.hryhoryeu.realty.dba.dao.base.BaseDaoImpl;
import by.home.hryhoryeu.realty.entities.pojo.dictionary.Dictionary;
import by.home.hryhoryeu.realty.entities.pojo.dictionary.HouseType;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DictionaryDao extends BaseDaoImpl<HouseType, Long> implements IDictionaryDao{

    @Override
    public List<Dictionary> get1(Long param) {

        String hql = "";


        if (param == 1)
            hql = "FROM StreetType";
        else if (param == 2)
            hql = "FROM HouseType";
        Query query = getSession().createQuery(hql);
        return (List<Dictionary>) query.list();
    }
}
