package basePatterns.structural.bridge;

/**
 * Created by hofa on 03.02.2018.
 */
public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();

}
