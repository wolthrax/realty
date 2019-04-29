package by.home.hryhoryeu.realty.services.dictionary;

import by.home.hryhoryeu.realty.entities.model.dictionary.Dictionary;

import java.util.List;

public interface IDictionaryService {

    List<Dictionary> findAll(Class clazz);

}
