package by.home.hryhoryeu.realty.entities.dto;

public class DictionaryDto {

    private Long id;
    private String value;

    public DictionaryDto() {
    }

    public DictionaryDto(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
