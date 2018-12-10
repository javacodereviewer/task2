package shape;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FileInsideTest {

    @Test
    public void addSource() {
        FileInside fileInside = FileInside.getInstance();
        fileInside.setPathToFile(".\\src\\test\\java\\shape\\input\\file\\file.txt");
        fileInside.addSource();
        List<String> list = fileInside.getSources();
        String actual = list.get(0);
        String expected = "0.0001 -3333.0 -3333.0 -3333.0";
        assertEquals(expected,actual);
    }

}