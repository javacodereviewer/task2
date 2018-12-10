package shape.calculations.newshape;

public class CubeInfo {
    public boolean isCube(double edgeLengthX,double edgeLengthY,double edgeLengthZ){
        return (edgeLengthX == edgeLengthY && edgeLengthY == edgeLengthZ)? true:false;
    }
}
