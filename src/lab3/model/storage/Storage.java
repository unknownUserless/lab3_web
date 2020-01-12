package lab3.model.storage;

import lab3.model.Check;

import java.util.List;

public interface Storage {

    void addCheck(Check check);
    List<Check> getChecks(String id);

}
