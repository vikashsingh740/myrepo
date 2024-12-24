package org.example.design.designpatterns.behaviour.Interpreter;

public class NonTerminalAddOperation implements AbstractExpression {

    AbstractExpression leftExpression;
    AbstractExpression rightExpression;

    public NonTerminalAddOperation(AbstractExpression leftExpression, AbstractExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context)+rightExpression.interpret(context);
    }
}
