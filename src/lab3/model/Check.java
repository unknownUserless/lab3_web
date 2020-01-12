package lab3.model;

import org.primefaces.json.JSONObject;

import java.io.Serializable;

public class Check implements Serializable {

    private float x;
    private float y;
    private int r;
    private boolean hit;
    private String id;

    public Check(){

    }

    public Check(float x, float y, int r, boolean hit, String id){
        this.x = x;
        this.y = y;
        this.r = r;
        this.hit = hit;
        this.id = id;

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public boolean isHit() {
        return hit;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public JSONObject getJSON(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("x", x);
        jsonObject.put("y", y);
        jsonObject.put("r", r);
        jsonObject.put("hit", hit);
        return jsonObject;
    }


}
