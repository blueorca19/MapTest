package task_9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Написать метод, который принимает на вход массив и функцию,
        // обрабатывает каждый элемент массива при помощи переданной функции
        // и создаёт сет получившихся элементов
        // [AAA, BBB, CCC, CCC] -> Set [AAAAAA, BBBBBB, CCCCCC]

        String[] array = {"AAA", "BB", "CCCC", "AAA"};
        System.out.println("Исходный массив :");
        System.out.println(Arrays.toString(array));
        Set<String> result = getSetFromArray(array, x -> x + x);
        System.out.println(result);
        result = getSetFromArray(array, x -> x + " - " + x.length());
        System.out.println(result);

        result = getSetFromArray(array, Function.identity());
        System.out.println(result);
    }

    public static Set<String> getSetFromArray(String[] array, Function<String, String> function) {
        Set<String> result = new HashSet<>();
        for (String currentValue : array) {
            String processedValue = function.apply(currentValue);
            result.add(processedValue);
        }
        return result;
    }
}

