public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Adder();
        System.out.println(calculator.calc(100));

        Calculator calculator2 = new Multiplier();
        System.out.println(calculator2.calc(10));
    }
}
