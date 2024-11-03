package function;

import java.util.function.*;

public class FunctionalInterfacesExample {

    public static void main(String[] args) {

        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));


        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println("Sum of 5 and 3: " + add.apply(5, 3));


        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());


        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello, World!");


        BiConsumer<Integer, Integer> multiplyAndPrint = (x, y) ->
                System.out.println("Multiplication of " + x + " and " + y + ": " + (x * y));
        multiplyAndPrint.accept(4, 6);
    }
}
