package shape;

import shape.calculations.CubeOnCoordinatePlanes;
import shape.calculations.SurfaceAreaCube;
import shape.calculations.VolumeCube;
import shape.calculations.newshape.NewShape;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cube implements Shape{
    private Logger log = LogManager.getLogger(Cube.class);
    private Dot dot;
    private double edgeLength;
    private NewShape newShape;

    public Dot getDot() {
        return dot;
    }
    public double getEdgeLength() {
        return edgeLength;
    }

    public void setDot(Dot dot) {
        this.dot = dot;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }




    public NewShape getNewShape() {
        return newShape;
    }


    public Cube(double edgeLength,double coordinateX,double coordinateY,double coordinateZ) {
        this.edgeLength = edgeLength;
        dot = new Dot(coordinateX,coordinateY,coordinateZ);
        if(isCut()){
            newShape = new NewShape(edgeLength,dot);
        }else{
            log.info("Cube doesn't have sections");
        }
    }
    public double getAreaCalculations(){
        SurfaceAreaCube surfaceAreaCube = new SurfaceAreaCube();
        return surfaceAreaCube.getAreaCalculations(edgeLength);
    }
    public double getVolumeCube(){
        VolumeCube volumeCube = new VolumeCube();
        return volumeCube.getVolume(edgeLength);
    }
    public boolean isOnCoordinatePlanes(){
        CubeOnCoordinatePlanes cocp = new CubeOnCoordinatePlanes();
        return cocp.isOnCoordinatePlanes(this);
    }

    private boolean isCut(){
        if(dot.getCoordinateX() < 0 && dot.getCoordinateX()+edgeLength > 0){
            return true;
        }else if(dot.getCoordinateY() < 0 && dot.getCoordinateY()+edgeLength > 0){
            return true;
        }else if(dot.getCoordinateZ() < 0 && dot.getCoordinateZ()+edgeLength > 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;

        return Double.compare(cube.edgeLength, edgeLength) == 0 &&
                Objects.equals(dot, cube.dot);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dot, edgeLength);
    }

    @Override
    public String toString() {
        return "Cube{" +
                edgeLength + ", "
                + dot.getCoordinateX() + ", "
                + dot.getCoordinateY() + ", "
                + dot.getCoordinateZ() + ", "
                +'}';
    }
}
