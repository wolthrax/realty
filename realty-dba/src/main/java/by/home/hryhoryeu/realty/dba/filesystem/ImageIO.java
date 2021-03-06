package by.home.hryhoryeu.realty.dba.filesystem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
@PropertySource(value = { "classpath:settings.properties" })
public class ImageIO implements IImageIO {

    private static final Logger logger = LogManager.getLogger(ImageIO.class);

    @Autowired
    private Environment environment;

    @Override
    public String save(byte[] image, String currentRealtyImagePath, String fileName) {

        boolean dirIsCreated = false;
        boolean fileIsCreated = false;

        String pathVariable = System.getenv(environment.getProperty("path.variable"));
        String imageDir = environment.getProperty("path.image");

        String fullDir = pathVariable + imageDir + currentRealtyImagePath;
        String filePath = fullDir + fileName;

        File dir = new File(fullDir);
        File pathFile = new File(filePath);

        if (!dir.exists()) {
            dirIsCreated = dir.mkdirs();
        }

        if (dir.exists() || dirIsCreated) {
            try {
                fileIsCreated = pathFile.createNewFile();
            } catch (IOException e) {
                logger.error("File can not created");
                e.printStackTrace();
            }
        }

        if (fileIsCreated) {
            try(FileOutputStream fos = new FileOutputStream(pathFile)) {
                fos.write(image, 0, image.length);
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        return imageDir + currentRealtyImagePath + fileName;
    }

    @Override
    public byte[] read(String fileDir) {

        byte[] image = null;

        String fullFileDir = System.getenv(environment.getProperty("path.variable")) + fileDir;

        try (ByteArrayOutputStream out = new ByteArrayOutputStream()){
            InputStream input = new BufferedInputStream(
                    new FileInputStream(fullFileDir));
            int data;
            while ((data = input.read()) != -1){
                out.write(data);
            }
            image = out.toByteArray();
        } catch (IOException e){
            e.printStackTrace();
            logger.error("Can`t read file");
        }
        return image;
    }
}
