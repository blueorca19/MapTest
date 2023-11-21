package task_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] array = {
            "AAA", "BBB", "CCC", "DDD", "AAA", "AAA", "AAA", "BBB", "CCC", "BBB", "CCC"
        } ;

        int countOfElements = 3;
        System.out.println(getElementByEncouters(array, countOfElements));
    }

    public static String getElementByEncouters(String[] array, int counter) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String currentElement : array) {
            if (map.containsKey(currentElement)) {
                int currentCounter = map.get(currentElement);
                map.put(currentElement, ++currentCounter);

            } else {
                map.put(currentElement, 1);
            }
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() == counter) {
                return pair.getKey();

            }
        }
        return null;
    }
}
