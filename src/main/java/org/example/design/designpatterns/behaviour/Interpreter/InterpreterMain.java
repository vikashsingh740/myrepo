package org.example.design.designpatterns.behaviour.Interpreter;

public class InterpreterMain {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("x",1);
        context.put("y",2);
        AbstractExpression leftExpression = new TerminalExpression("x");
        AbstractExpression rightExpression = new TerminalExpression("y");
        AbstractExpression nonTerminalExpression = new NonTerminalAddOperation(leftExpression,rightExpression);
        int val = nonTerminalExpression.interpret(context);
        System.out.println("Value ========>>> "+val);
    }
}
