public class MyStack {
    public int top;
    public int[] itemArray;
    public int stackSize;

    public MyStack(int stackSize) {
        this.stackSize = stackSize;
        itemArray = new int[stackSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == this.stackSize - 1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("stack is full");
        }
        else {
            itemArray[++top] = item;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        else {
            return itemArray[top--];
        }
    }
}
