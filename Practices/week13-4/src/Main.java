public class Main {
    public static void main(String[] args) {
        Adder adder = new MyAdder();
        UseAdder userAdder = new UseAdder();
        System.out.println(userAdder.add(adder, 10, 20));

        Adder adder1 = new YourAdderAdapter(new YourAdder());
        System.out.println(userAdder.add(adder1, 10, 20));
    }
}
