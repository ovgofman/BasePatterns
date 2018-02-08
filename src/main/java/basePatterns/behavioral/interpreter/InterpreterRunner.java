package basePatterns.behavioral.interpreter;

/**
 * Created by hofa on 09.02.2018.
 */
public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();


        System.out.println("Does dev knows JavaCore: " + isJava.interpret("Java Core"));
        System.out.println("Does dev knows JavaEE: " + isJavaEE.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new OrExpression(java, spring);
    }


}
