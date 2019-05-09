package by.home.hryhoryeu.realty.dba.dao.dictionary;

import by.home.hryhoryeu.realty.dba.dao.base.BaseDao;
import by.home.hryhoryeu.realty.entities.model.dictionary.Dictionary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
@Scope("singleton")
public class DictionaryDao extends BaseDao<Dictionary, Long> implements IDictionaryDao{

    @Override
    public List<?> findByType(Class clazz) {
        String hql = "FROM "+clazz.getName();
        Query query = getSession().createQuery(hql);
        return query.getResultList();
    }
}
