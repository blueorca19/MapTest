package task_5;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        //написать функцию которая округляет переданные числа
        //Double -> Long
        //123.45 ->123
        //456.87 -> 457

        MyFunction myFunction = new MyFunction();
        System.out.println("Реализация при помощи обычного класса");

        System.out.println(myFunction.apply(123.45));
        System.out.println(myFunction.apply(456.87));


        System.out.println("Реализация при помощи анонимного класса");
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        System.out.println(function.apply(124.41));
        System.out.println(function.apply(567.80));

        System.out.println("Реализация при помощи лямбда - выражения");
        Function<Double, Long> lamdaFunction = x -> Math.round(x);
        System.out.println(lamdaFunction.apply(122.56));
        System.out.println(lamdaFunction.apply(789.98));
        Function<Double, Long> absoluteRounding = x -> {
            double abs = Math.abs(x);
            return Math.round(abs);

        };
        System.out.println(absoluteRounding.apply(-127.56));

        Function<Double, Long> absoluteRounding1 = x -> Math.round(Math.abs(x));
        System.out.println(absoluteRounding1.apply(-122.56));

        long absoluteRound = Math.round(Math.abs(-456.87));
        System.out.println(absoluteRound);

        System.out.println("Реализация при помощи метода референс");
        Function<Double, Long> referenceFunction = Math::round;
        System.out.println(referenceFunction.apply(333.12));

    }
}
