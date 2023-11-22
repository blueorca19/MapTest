package task_6;

import java.util.function.Function;

public class ConvertTypes {
    public static void main(String[] args) {
        // есть объект собаки
        // написать функцию, которая объект собаки преобразует
        // в объект кошка, увеличивая возраст на 2 и добавляя к цвету приставку светло
        // собака возраст 3, цвет серый -> кот возраст 6, цвет светло серый

        Function<Dog, Cat> converter = x -> new Cat(x.getAge() * 2, "светло-" + x.getColor());

        Dog dog = new Dog(3, "серый");
        Dog dog1 = new Dog(1, "черный");
        System.out.println("Исходная собака " + dog);
        System.out.println("Получившийся кот " + converter.apply(dog));
        System.out.println("Исходная собака " + dog1);
        System.out.println("Получившийся кот " + converter.apply(dog1));


    }
}
