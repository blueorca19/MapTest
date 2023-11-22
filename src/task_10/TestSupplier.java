package task_10;
import java.util.Random;
import java.util.function.Supplier;
public class TestSupplier {
    public static void main(String[] args) {
        // генератор уникальных идентификаторов
        Supplier<Integer> uniqueId = () -> {
            Random random = new Random();
            return random.nextInt(Integer.MAX_VALUE);
        };

        for (int i = 0; i < 10; i++) {
            System.out.println(uniqueId.get());
        }
    }

}
