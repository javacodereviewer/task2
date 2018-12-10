package shape;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileInside {
    private Logger log = LogManager.getLogger(FileInside.class);
    private static FileInside instance = null;
    private List<String> sources;
    // Unix file path "/input/file/file.txt"
    // Windows file path "\input\file\file.txt"
    // File.separator + "input" + File.separator + "file" + File.separator + "test.txt"
    private String pathToFile = ".\\src\\main\\java\\shape\\input\\file\\file.txt";
    private FileInside(){
        addSource();
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public void addSource(){
        try {
            sources = Files.readAllLines(Paths.get(pathToFile),Charset.forName("UTF-8"));
        }catch (IOException e) {
            log.error("File not found");
        }
    }
    public List<String> getSources() {
        return sources;
    }
    public static FileInside getInstance(){
        if(instance == null){
            instance = new FileInside();
        }
        return instance;
    }

}
