package task_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IdentityTest {
    public static void main(String[] args) {
        Function<String, String> function = x -> x;
        Function<String, String> function1 = Function.identity();

        System.out.println(function.apply("Hello!"));
        System.out.println(function1.apply("Hello!"));
        System.out.println("Hello!");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Преобразование списка строк в верхний регистр с использованием identity
        List<String> upperCaseNames = names.stream()
                .map(Function.identity())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);
    }
}
