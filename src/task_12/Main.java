package task_12;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 7, 1, 8, 0, 11, 14, 9, 7);
        //Получить из листа коллекцию нечетных чисел без дубликатов

        //При помощи цикла

        Set<Integer> set = new HashSet<>();
        for (Integer current : numbers) {
            if (current % 2 != 0) {
                set.add(current);
            }
        }
        System.out.println("Исходный лист - " + numbers);
        System.out.println("Получившийся сет - " + set);

        // При помощи stream
        Set<Integer> result = numbers.stream().//поток листа
                filter(x -> x % 2 != 0). // фильтруем поток по нашим параметрам
                collect(Collectors.toSet());// пакуем обратно в коллекцию - терминальный метод
        System.out.println("Результат - " + result);

        // Получить сумму всех элементов листа

        // при помощи цикла
        int sum = 0;
        for (Integer current : numbers) {
            if (current % 2 != 0) {
                sum += current;
            }
        }
        System.out.println("Сумма нечетных чисел - " + sum);

        // При помощи stream
        int sum1 = numbers.stream()
                .filter(x -> x % 2 != 0)
                .reduce((x, y) -> x + y)//передаются соседние элементы стрима по очереди
                // и сумма чисел всегда при следующей операции x
                //Пример по исходному листу:
                //7->x, 1->y = 8, 8->x, 11 ->y =19, 19->x, 9->y=28, 28->x, 7->y = 35 то есть сумма всегда x
                .orElse(-1);//результат по умолчанию, потому что методу не с чем работать

        System.out.println("Сумма нечетных чисел stream - " + sum1);


    }

}
