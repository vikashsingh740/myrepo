package org.example.design.solid.dependencyinversion.bad;

/*
  Here high level module is Calculator but it depends on low level module/object
  like AddOperation and SubtractOperation
 */
public class BadCalculator {

    public int calculate(int num1, int num2, String operation) {
        int result = 0;
        switch (operation) {
            case "sum":
                AddOperation addOperation = new AddOperation();
                return addOperation.perform(num1, num2);
            case "subtract":
                SubtractOperation subtractOperation = new SubtractOperation();
                return subtractOperation.perform(num1, num2);
        }
        return result;
    }
}
