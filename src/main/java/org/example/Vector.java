package org.example;

public class Vector {
    private Double x;
    private Double y;
    private Double z;

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    public String toString() {
        return "Vector: " +
                "x=" + x +
                ", y=" + y +
                ", z=" + z ;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double getZ() {
        return z;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setZ(Double z) {
        this.z = z;
    }
    /**
     * Return length of vector
     * */
    public double vecLength(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public Double scalar(Vector vector2) {
        return x*vector2.x+y*vector2.y+z*vector2.z;
    }

    public Vector vectComp(Vector vector2) {
        return new Vector(
                y*vector2.z-z*vector2.y,
                z*vector2.x-x*vector2.z,
                x*vector2.y-y*vector2.x
        );
    }
    /**
     * Angel between vectors
     * */
    public Double cosinVec(Vector vector2) {
        return scalar(vector2)/(vecLength()*vector2.vecLength());
    }
    /**
     * Summa vectors
     * */
    public Vector summa(Vector vector2) {
        return new Vector(
                x+vector2.x,
                y+vector2.y,
                z+vector2.z);
    }
    /**
     * Differ vectors
     * */
    public Vector differ(Vector vector2) {
        return new Vector(
                x-vector2.x,
                y-vector2.y,
                z-vector2.z);
    }
}