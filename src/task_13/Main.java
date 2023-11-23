package task_13;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> numbers = List.of("10", "20", "30", "10", "100", "50");

        String result = numbers.stream().reduce((x, y) -> x + y).orElse("");
        System.out.println("Результат -" + result);// Получилось склеивание строк - метод контентинации

        // Получить сумму математически
        // Преобразовать строки в числа - сложить их
        // результат преобразовать в стринг
        String result1 = String.valueOf(numbers.stream().map(x -> Integer.parseInt(x)).reduce((x, y) -> x + y).orElse(0));
        System.out.println("Результат -" + result1); // Получился математический результат чисел - 220

        // Найти количество элементов, которые меньше 50
        long result2 = numbers.stream() // делаем поток с массива
                .map(x -> Integer.parseInt(x))// переводим строку в число 10, 20, 30, 10, 100, 50
                .filter(x -> x < 50)// фильтруем по параметрам (10, 20, 30,10)
                .count(); // смотрим общее число чисел, которые меньше 50

        System.out.println("Результат -" + result2);


        // ДЗ:
        // Подсчитать количество элементов содержащих подстроку 10

        long result3 = numbers.stream()//поток листа
                .filter(x -> x.contains("10")) // фильтруем поток по нашим параметрам
                .count();// смотрим общее число чисел, содержащих подстроку 10
        System.out.println("Результат количествa элементов содержащих подстроку 10 - " + result3);


        // Отсортировать лист в алфавитном порядке
        List<String> result4 = numbers.stream()//поток листа
                .sorted()// сортируем поток в алфавитном порядке
                .collect(Collectors.toList());// пакуем обратно в коллекцию - терминальный метод
        System.out.println("Лист в алфавитном порядке - " + result4);


        // Отсортировать лист в математическом порядке по возрастанию

        List<Long> result5 = numbers.stream() // делаем поток с массива
                .map(x -> Long.parseLong(x))// переводим строку в число 10, 20, 30, 10, 100, 50
                .sorted()// сортируем поток в математическом порядке по возрастанию
                .collect(Collectors.toList());// пакуем обратно в коллекцию - терминальный метод

        System.out.println("Лист в математическом порядке по возрастанию -" + result5);

        // Найти максимальное число
        long result6 = numbers.stream() // делаем поток с массива
                .map(x -> Integer.parseInt(x))// переводим строку в число 10, 20, 30, 10, 100, 50
                .max((x, y) -> Integer.compare(x, y))// фильтруем поток по заданным параметрам
                .orElse(-1);

        System.out.println("Максимальное число -" + result6);
    }
}
