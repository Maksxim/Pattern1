package by.tms.project.work2;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    String name;
    List <String> functional = new ArrayList<>();

    @Override
    public String toString() {
        return "Model phone: " + name + "\n" + functional;
    }
}
