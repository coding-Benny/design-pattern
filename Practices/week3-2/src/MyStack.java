import java.util.ArrayList;

public class MyStack extends ArrayList<String> {
    public void push(String item) {
        add(item);
    }

    public String pop() {
        return remove(size() - 1);
    }
}
