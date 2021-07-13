package work1;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x,y) -> x + y;
    BinaryOperator<Integer> minus = (x,y) -> x - y;
    BinaryOperator<Integer> multiple = (x,y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> {
        if (y == 0) {
            System.out.println("Divide by zero");
            return 0;
        }
        return x / y;
    }; // не понял что нужно возвращать если "y" равно 0.

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

    Consumer<String> rrr = System.out::println;

}
