package task_14;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list1 = List.of("A", "B", "C");
        List<String> list2 = List.of("D", "E", "F");
        List<String> list3 = List.of("G", "H", "I");

        List<List<String>> listOfList = List.of(list1, list2, list1); // склеить листы можно как угодно,
        // передавая аргументы в List.of(list1, list3, list2) - например
        //Преоблазовать лист листов в простой лист, который содержит все элементы
        //("A", "B", "C")
        //("D", "E", "F") -> "A", "B", "C", "D", "E", "F","G", "H", "I"
        //("G", "H", "I")

        System.out.println("На входе: ");
        listOfList.forEach(x -> System.out.println(x));
        List<String> result = listOfList.stream()  //стрим листов
                .flatMap(x -> x.stream()) // стрим стрингов, объединненый из 3 стримов стрингов
                .collect(Collectors.toList());

        System.out.println("На выходе: " + result);



    }
}
