package org.example.dp;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    Map<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int result = fib(n - 2) + fib(n - 1);
        map.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fib(6);
        System.out.println("======>>> " + result);
    }
}
