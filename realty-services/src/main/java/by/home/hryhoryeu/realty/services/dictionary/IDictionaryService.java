package by.home.hryhoryeu.realty.services.dictionary;

import by.home.hryhoryeu.realty.entities.dto.DictionaryDto;

import java.util.List;

public interface IDictionaryService {

    List<DictionaryDto> findAll(Class clazz, String lang);

}
