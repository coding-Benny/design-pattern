import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<String> arList;

    public MyStack() {
        this.arList = new ArrayList<String>();
    }

    public void push(String item) {
        arList.add(item);
    }

    public String pop() {
        return arList.remove(arList.size() - 1);
    }
}
