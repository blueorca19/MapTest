package task_1;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("Banana", 120);
        products.put("Apple", 90);
        products.put("Orange", 200);
        products.put("Peer", 150);
        products.put("Banana", 130);
        products.put("Orange", 210);
        System.out.println("Цена на апельсин -" + " " + products.get("Orange"));
        System.out.println("Цена на банан -" + " " + products.get("Banana"));
        System.out.println("Цена на кокос -" + " " + products.get("Coconut"));
        System.out.println(products);
        List<String> words = new ArrayList<>();
        for (String currentWorld : words) {

        }
        for (Map.Entry<String, Integer> pair : products.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            String forPrint = String.format("Название - %s, цена - %d", key, value);
            System.out.println(forPrint);
        }

        System.out.println("Список продуктов без цен:");

        for (String currentProduct : products.keySet()) {
            System.out.println(currentProduct);
        }
        System.out.println("Средняя цена товаров в магазине:");
        int sum = 0;
        for (int currentPrise : products.values()) {
            sum = sum + currentPrise;
            //sum+=currentPrise;

        }
        System.out.println(sum / products.size());
        System.out.println("Удаляем из списка все товары, у которых цена меньше 150");
        Iterator<Map.Entry<String, Integer>> iterator = products.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pairEx = iterator.next();
            if (pairEx.getValue() < 150) {
                iterator.remove();
            }
        }
        System.out.println(products);
    }
}

