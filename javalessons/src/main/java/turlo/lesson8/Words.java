package turlo.lesson8;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        String[] words =
                {
                        "Cat", "Dog", "Hare",
                        "Duck", "Fox", "Tiger",
                        "Dog", "Cat", "Tiger",
                        "Fox", "Pig", "Bear",
                        "Dog", "Cat", "Frog",
                        "Wolf", "Tiger", "Dog"

                };

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        System.out.println(map);
        System.out.println("");

    }
}

