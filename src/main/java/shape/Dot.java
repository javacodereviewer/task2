package shape;

import java.util.Objects;

public class Dot {
    private double coordinateX;
    private double coordinateY;
    private double coordinateZ;

    public Dot(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = 0;
    }

    public Dot(double coordinateX, double coordinateY, double coordinateZ) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public double getCoordinateZ() {
        return coordinateZ;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dot dot = (Dot) o;
        return Double.compare(dot.coordinateX, coordinateX) == 0 &&
                Double.compare(dot.coordinateY, coordinateY) == 0 &&
                Double.compare(dot.coordinateZ, coordinateZ) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY, coordinateZ);
    }

    @Override
    public String toString() {
        return "Dot{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", coordinateZ=" + coordinateZ +
                '}';
    }
}
