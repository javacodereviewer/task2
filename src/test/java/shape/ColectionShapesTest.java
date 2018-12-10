package shape;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ColectionShapesTest {

    @Test
    public void getShapes() {
        boolean isSame = true;
        ColectionShapes colectionShapes = new ColectionShapes();
        FileInside fileInside = colectionShapes.getFileInside();
        fileInside.setPathToFile(".\\src\\test\\java\\shape\\input\\file\\file.txt");
        fileInside.addSource();
        ArrayList<Cube> actual = colectionShapes.addCube();
        ArrayList<Shape> expected = new ArrayList<>();
        expected.add(new Cube(0.0001, -3333.0, -3333.0, -3333.0));
        expected.add(new Cube(2.0, 0, 0, 0));
        expected.add(new Cube(3333.0, 3333.0, 3333.0, 3333.0));
        assertTrue(actual.get(0).equals(expected.get(0)));
        assertTrue(actual.get(1).equals(expected.get(1)));
        assertTrue(actual.get(2).equals(expected.get(2)));

    }
}