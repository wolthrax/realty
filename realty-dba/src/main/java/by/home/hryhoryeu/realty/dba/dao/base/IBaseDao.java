package by.home.hryhoryeu.realty.dba.dao.base;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao<T, PK extends Serializable> {

    List<T> findAll();
    List<T> getKeyVal(Class clazz);
    T findById(PK id);
    PK set(T object);
    void update (T object);
    void delete (T object);
}
