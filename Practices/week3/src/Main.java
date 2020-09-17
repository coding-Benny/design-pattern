public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(10);
        stack.itemArray[++stack.top] = 20;
        System.out.println(stack.itemArray[stack.top]);
    }
}
