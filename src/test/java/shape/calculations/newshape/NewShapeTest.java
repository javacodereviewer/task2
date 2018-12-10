package shape.calculations.newshape;

import org.junit.Test;
import shape.Cube;
import shape.Dot;

import static org.junit.Assert.*;

public class NewShapeTest {

    @Test
    public void getVolumeRatios() {
        Cube cube = new Cube(2.0,-1.0,-1.0,-1.0);
        NewShape newShape = cube.getNewShape();
        double expected = 1.0;
        double actual = newShape.getVolumeRatios();
        assertEquals(expected,actual,0.0);
        cube.setDot(new Dot(2.0,-1.0,-1.0));
        cube.setEdgeLength(2.0);
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void isCube() {
        Cube cube = new Cube(2.0,-1.0,-1.0,-1.0);
        NewShape newShape = cube.getNewShape();
        boolean actual = newShape.isCube();
        assertTrue(actual);
        Cube cube1 = new Cube(2.0,-2.0,-1.0,-1.0);
        NewShape newShape1 = cube1.getNewShape();
        boolean actual1 = newShape1.isCube();
        assertTrue(!actual1);
    }
}