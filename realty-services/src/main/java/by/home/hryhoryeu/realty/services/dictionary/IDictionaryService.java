package by.home.hryhoryeu.realty.services.dictionary;

import by.home.hryhoryeu.realty.entities.pojo.dictionary.Dictionary;

import java.util.List;

public interface IDictionaryService {

    List<Dictionary> getAll(Long param);

}
