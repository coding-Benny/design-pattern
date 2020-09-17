import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> items;
    private int stackSize;

    public MyStack(int stackSize) {
        this.stackSize = stackSize;
        items = new ArrayList<Integer>(stackSize);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean isFull() {
        return items.size() >= this.stackSize;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("stack is full");
        }
        else {
            items.add(new Integer(item));
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        else {
            return items.remove(items.size() - 1);
        }
    }
}
