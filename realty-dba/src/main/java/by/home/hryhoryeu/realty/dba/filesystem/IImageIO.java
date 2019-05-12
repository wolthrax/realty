package by.home.hryhoryeu.realty.dba.filesystem;

public interface IImageIO {

    String save(byte[] image, String path, String fileName);
    byte[] read(String fileDir);

}
