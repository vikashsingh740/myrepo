package org.example.design.designpatterns.behaviour.Interpreter;

public class TerminalExpression implements AbstractExpression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public int interpret(Context context) {
        return context.get(data);
    }
}
