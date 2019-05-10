package by.home.hryhoryeu.realty.services.dictionary;

import by.home.hryhoryeu.realty.dba.dao.dictionary.IDictionaryDao;
import by.home.hryhoryeu.realty.entities.dto.DictionaryDto;
import by.home.hryhoryeu.realty.entities.model.dictionary.Dictionary;
import by.home.hryhoryeu.realty.services.dictionary.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Scope(scopeName = "singleton")
@Service
public class DictionaryService implements IDictionaryService {

    private IDictionaryDao dictionaryDao;

    @Autowired
    public DictionaryService(IDictionaryDao dictionaryDao) {
        this.dictionaryDao = dictionaryDao;
    }


    @Override
    public List<DictionaryDto> findAll(Class clazz, String lang) {

        List<Dictionary> dictionaryList = dictionaryDao.findByType(clazz);

        List<DictionaryDto> dtoList = new ArrayList<>();
        for (Dictionary dict : dictionaryList) {
            if (lang != null) {
                if (lang.equals("ru")) {
                    dtoList.add(new DictionaryDto(dict.getId(), dict.getValueRu()));
                } else {
                    dtoList.add(new DictionaryDto(dict.getId(), dict.getValueEn()));
                }
            }
        }
        return dtoList;
    }
}
