package org.example.design.solid.openclose;

public class BadCalculator {

    public int calculate(int num1, int num2, String type){
        int result = 0;
        switch (type){
            case "sum":
                result = num1+num2;
            case "subtract":
                result = num1-num2;
        }
        return result;
    }
}
