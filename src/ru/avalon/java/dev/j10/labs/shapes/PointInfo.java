package ru.avalon.java.dev.j10.labs.shapes;

public class PointInfo implements Point {
    float x;
    float y;

    public PointInfo(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }
}
