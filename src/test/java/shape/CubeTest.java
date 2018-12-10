package shape;

import org.junit.Test;

import static org.junit.Assert.*;

public class CubeTest {

    @Test
    public void getAreaCalculations() {
        Cube cube = new Cube(2,2,2,2);
        double expected = 24.0;
        double actual = cube.getAreaCalculations();
        assertEquals(expected,actual,0.0);
    }

    @Test
    public void getVolumeCube() {
        Cube cube = new Cube(2,-1,-1,-1);
        double expected = 8.0;
        double actual = cube.getVolumeCube();
        assertEquals(expected,actual,0.0);
    }
    @Test
    public void isOnCoordinatePlanes(){
        Cube cube = new Cube(2,0,2,2);
        assertTrue(cube.isOnCoordinatePlanes());
        Cube cube1 = new Cube(2,2,0,2);
        assertTrue(cube1.isOnCoordinatePlanes());
        Cube cube2 = new Cube(2,2,2,0);
        assertTrue(cube2.isOnCoordinatePlanes());
        Cube cube3 = new Cube(2,2,2,2);
        assertTrue(!cube3.isOnCoordinatePlanes());

    }

}