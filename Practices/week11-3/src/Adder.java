import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Adder {
    public static void main(String[] args) {
        // 실습 1
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Melon", "Grape", "Strawberry"));
        System.out.println(list.stream().map(s->s.toUpperCase()).collect(Collectors.joining("#")));
        list.stream().map(s->s.length()).forEach(s-> System.out.println(s));
        list.stream().map(String::length).forEach(System.out::println);
        list.stream().filter(s->s.length() > 5).forEach(System.out::println);
        System.out.println(list.stream().map(s->s.length()).reduce(0, (a, b)->a+b));

        // 실습 2
        IntStream intStream1 = IntStream.range(1, 100);
        System.out.println(intStream1.filter(x->x%2==0).reduce(0, (a, b)->a+b));
        IntStream intStream2 = IntStream.range(1, 100);
        System.out.println(intStream2.filter(x->x%2==1).reduce(0, (a, b)->a+b));
        IntStream intStream3 = IntStream.range(1, 100);
        System.out.println(intStream3.reduce(0, (a, b)->a+b));

        // 실습 3
        System.out.println(IntStream.rangeClosed(1, 100).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));
    }
}
