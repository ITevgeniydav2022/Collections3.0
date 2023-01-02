package map;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
    private static final Map<String, Integer> MAP = new HashMap<>();

    public static void main(String[] args) {

        // Задание 3
        System.out.println("Задание 3");

        MAP.put("str1", 2);
        System.out.println(MAP);
        tryPut("str2", 1);
        System.out.println(MAP);
        try {
            tryPut("str1", 2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        tryPut("str1", 5);
        System.out.println(MAP);
    }

    private static void tryPut(String key, Integer value) {
        if (MAP.containsKey(key) && MAP.get(key).equals(value)) {
            throw new IllegalArgumentException("Такой ключ уже есть");
        }
        MAP.put(key, value);
    }
}

