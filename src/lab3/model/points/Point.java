package lab3.model.points;

import java.io.Serializable;

public class Point implements Serializable {

    private String x;
    private float y;
    private int r;

    public String getX(){
        return x;
    }

    public void setX(String x){
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
