package it.unibo.mvc;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Application controller. Performs the I/O.
 */
public class Controller {

    private static final String SEP = File.separator;
    private static final String FILE_NAME = System.getProperty("user.home") + SEP + "output.txt";
    
    private  File file = new File(FILE_NAME);
    
    public void setFile(final File file){
        this.file=file;
    }

    public File getFile(){
        return file;
    }

    public String getPath(){
        return file.toPath().toString();
    }

    public void write(final String things){
        try {
            Files.writeString(file.toPath(), things);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
