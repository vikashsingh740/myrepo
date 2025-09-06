package org.example;

import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class General {

    public static void main(String[] args) {
//        General general = new General();
//        general.find2ndMax();
//        general.firstRepeatingCharacter("vikashik");
    }

    private void firstRepeatingCharacter(String name) {
        Optional<Map.Entry<Character, Long>> e1 = name.chars().mapToObj(c -> (char) c).collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue() > 1).findFirst();
        e1.ifPresent(characterLongEntry -> System.out.println("=====>>> " + characterLongEntry.getKey()));
    }

    private void find2ndMax() {
        int[] a = {2, 12, -3, 4, 0, 6, 7, -2};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (max1 < a[i]) {
                max2 = max1;
                max1 = a[i];
            }
            if (max1 > a[i] && max2 < a[i]) {
                max2 = a[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
