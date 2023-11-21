package task_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> flights = new HashMap<>();

        flights.put("Berlin", "London");
        flights.put("Tokyo", "Seoul");
        flights.put("Mumbai", "Berlin");
        flights.put("Seoul", "Mumbai");
        flights.put("London", "Madrid");
        flights.put("Barselona", "Tokyo");
        flights.put("Moskow", "Paris");
        flights.put("Paris", "Rome");

        List<String> startCitys = getStartCity(flights);

        for (String startCity : startCitys) {
            System.out.println("Стартовый город: " + startCity);
            System.out.println("Маршрут: " + createRoute(flights, startCity));
            System.out.println();
        }

    }

    public static List<String> getStartCity(Map<String, String> flights) {
        List<String> startCities = new ArrayList<>();

        for (String currentCity : flights.keySet()
        ) {
            if (!flights.containsValue(currentCity)) {
                startCities.add(currentCity);
            }

        }
        return startCities;

    }

    public static String createRoute(Map<String, String> flights, String startCity) {
        StringBuilder builder = new StringBuilder();
        String landingCity = flights.get(startCity);
        while (landingCity != null) {
            builder.append(startCity).append(" -> ").append(landingCity).append(", ");
            startCity = landingCity;
            landingCity = flights.get(startCity);

        }
        builder.setLength(builder.length() - 2);
        return builder.toString();

    }
}
