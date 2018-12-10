package shape.calculations.newshape;

import shape.Dot;
import shape.Validation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NewShape {
    private Logger log = LogManager.getLogger(NewShape.class);
    private double edgeLengthX;
    private double edgeLengthY;
    private double edgeLengthZ;

    public NewShape(double edgeLength, Dot dot) {
        if(Validation.isValidation(edgeLength)) {
            edgeLengthX = (dot.getCoordinateX() < 0 && dot.getCoordinateX() + edgeLength > 0) ?
                    edgeLength + dot.getCoordinateX() : edgeLength;
            edgeLengthY = (dot.getCoordinateY() < 0 && dot.getCoordinateY() + edgeLength > 0) ?
                    edgeLength + dot.getCoordinateY() : edgeLength;
            edgeLengthZ = (dot.getCoordinateZ() < 0 && dot.getCoordinateZ() + edgeLength > 0) ?
                    edgeLength + dot.getCoordinateZ() : edgeLength;
        }else{
            log.error("Length of edge can not have negative value");
        }
    }
    public double getVolumeRatios(){
        VolumeNewShape volumeNewShape = new VolumeNewShape();
        return volumeNewShape.getVolumeRatios(edgeLengthX,edgeLengthY,edgeLengthZ);
    }
    public boolean isCube(){
        CubeInfo cubeInfo = new CubeInfo();
        return cubeInfo.isCube(edgeLengthX,edgeLengthY,edgeLengthZ);
    }

}
