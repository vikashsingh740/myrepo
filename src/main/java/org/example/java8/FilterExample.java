package org.example.java8;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> list1 = list.stream().filter((a)->{
            return a%2==0;
        }).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println("=============================================");

        List<Integer> list2 = list.stream().filter((a)->a%2==0).collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("=============================================");
        Predicate<Integer> predicate = (a)-> {
            boolean flag = (a%2 == 0);
            return flag;
        };
        List<Integer> list3 = list.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(list3);
    }
}
