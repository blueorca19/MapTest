package task_10;

import java.util.Random;
import java.util.function.Supplier;

public class TestSupplier {

    private static String[] players = {"Jack", "Jon", "Bob", "Ben", "Grege", "Steve"};

    public static void main(String[] args) {
        // генератор уникальных идентификаторов
        Supplier<Integer> uniqueId = () -> {
            Random random = new Random();
            return random.nextInt(10) + 101; // (Integer.MAX_VALUE)
        };

        for (int i = 0; i < 10; i++) {
            System.out.println(uniqueId.get());
        }
        Supplier<String> nameGenerator = () -> players[new Random().nextInt(players.length)];

        for (int i = 0; i < 5; i++) {
            System.out.println(nameGenerator.get() + "It`s your turn now");

        }
    }

}
