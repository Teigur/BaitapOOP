package Bai7;

public class ToaDo {
    private String ten;
    private float x,y;

    public ToaDo() {
        this.ten = "O";
        this.x = 0;
        this.y = 0;
    }

    public ToaDo(float x, float y) {
        this.ten = "O";
        this.x = x;
        this.y = y;
    }

    public ToaDo(String ten, float x, float y) {
        this.ten = ten;
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%1s (%1.1f, %1.1f)",ten,x,y);
    }
}