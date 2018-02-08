package basePatterns.behavioral.interpreter;

/**
 * Created by hofa on 09.02.2018.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        } else
            return false;
    }
}
