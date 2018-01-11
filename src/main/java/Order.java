import java.util.Collections;
import java.util.Comparator;

public class Order {

    String name;

    String curretTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurretTime() {
        return curretTime;
    }

    public void setCurretTime(String curretnTime) {
        this.curretTime = curretnTime;
    }

    public Order(String name, String curretTime) {
        this.name = name;
        this.curretTime = curretTime;
    }
}
