package by.home.hryhoryeu.realty.services.dictionary.impl;

import by.home.hryhoryeu.realty.dba.dao.dictionary.IDictionaryDao;
import by.home.hryhoryeu.realty.entities.pojo.dictionary.Dictionary;
import by.home.hryhoryeu.realty.services.dictionary.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Scope(scopeName = "singleton")
@Service
public class DictionaryServiceImpl implements IDictionaryService {

    @Autowired
    private IDictionaryDao dictionaryDao;


    @Override
    public List<Dictionary> getAll(Long param) {
        return dictionaryDao.get1(param);
    }
}
