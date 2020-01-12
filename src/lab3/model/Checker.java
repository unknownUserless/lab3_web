package lab3.model;

import lab3.model.oracleDB.OracleStorage;
import lab3.model.points.Point;
import lab3.model.storage.Storage;
import org.primefaces.json.JSONArray;

import static java.lang.Math.*;

import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;

public class Checker implements Serializable {

    private Point canvasPoint;

    private Point formPoint;

    private int r;

    public Checker(){

    }

    private Storage storage = new OracleStorage();

    public void addFormCheck() {
        addCheck(formPoint);
    }

    public void addCanvasCheck(){
        addCheck(canvasPoint);
    }

    protected void addCheck(Point point){
        if (point.getX().contains(",")){
            point.setX(point.getX().replace(",", "."));
        }
        String id = getId();
        Check check = new Check(Float.parseFloat(point.getX()),
                point.getY(),
                r, check(point), id);
        storage.addCheck(check);
    }

    protected boolean check(Point point) {
        float fx = Float.parseFloat(point.getX());
        float fr = (float) r;
        float y = point.getY();

        if (fx <= 0 && fx >= -fr / 2 && y <= 0 && y > -fr) return true;
        if (y >= 0 && fx >= -fr && fx <= 0 && fx + fr > y) return true;
        if (pow(fx, 2) + pow(y, 2) < pow(fr, 2) && y >= 0 && fx >= 0) return true;

        return false;
    }

    protected String getId() {
        return FacesContext.getCurrentInstance().
                getExternalContext().getSessionId(false);
    }

    public List<Check> getList() {
        return storage.getChecks(getId());
    }


    public String getJson() {
        JSONArray array = new JSONArray();
        getList().forEach(c -> array.put(c.getJSON()));
        return array.toString();
    }

    public Point getCanvasPoint() {
        return canvasPoint;
    }

    public void setCanvasPoint(Point point){
        this.canvasPoint = point;
    }

    public Point getFormPoint(){
        return formPoint;
    }

    public void setFormPoint(Point point){
        this.formPoint = point;
    }

    public int getR(){
        return r;
    }

    public void setR(int r){
        this.r = r;
    }

}
