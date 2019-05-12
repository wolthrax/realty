package by.home.hryhoryeu.realty.dba.dao.realty;

import by.home.hryhoryeu.realty.dba.dao.base.BaseDao;
import by.home.hryhoryeu.realty.entities.dto.realty.RealtySearchData;
import by.home.hryhoryeu.realty.entities.model.realty.Realty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Scope("singleton")
public class RealtyDao extends BaseDao<Realty, Long> implements IRealtyDao {

    public RealtyDao() {
        super(Realty.class);
    }

    @Override
    public List<Realty> search(RealtySearchData searchData) {
        return findAll();
    }
}
