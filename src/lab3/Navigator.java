package lab3;

import java.io.Serializable;

public class Navigator implements Serializable {

    public String doAction(){
        return "success";
    }

    public String back(){
        return "back";
    }

    public String main(){
        return "main";
    }

}
