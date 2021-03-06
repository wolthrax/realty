package by.home.hryhoryeu.realty.dba.dao.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
@Scope("singleton")
public class BaseDao<T, PK extends Serializable> implements IBaseDao<T, PK> {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Class<T> clazz;

    public BaseDao() {
        super();
    }

    public BaseDao(Class<T> clazz) {
        this.clazz = clazz;
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findAll() {
        @SuppressWarnings("deprecation")
        List<T> list = getSession().createCriteria(clazz).list();
        return list;
    }

    @Override
    public T findById(PK id) {
        T object = getSession().get(clazz, id);
        return object;
    }

    @SuppressWarnings("unchecked")
    @Override
    public PK set(T object) {
        PK id = (PK) getSession().save(object);
        return id;
    }

    @Override
    public void delete(Object object) {
        getSession().delete(object);
    }

    @Override
    public void update(Object object) {
        getSession().update(object);
    }
}
