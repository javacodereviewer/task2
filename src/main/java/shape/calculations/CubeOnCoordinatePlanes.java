package shape.calculations;

import shape.Cube;

public class CubeOnCoordinatePlanes {
    public boolean isOnCoordinatePlanes(Cube cube){
        if(cube.getDot().getCoordinateX() == 0){
            return true;
        }else if(cube.getDot().getCoordinateY() == 0){
            return true;
        }else if(cube.getDot().getCoordinateZ() == 0){
            return true;
        }else{
            return false;
        }
    }
}
