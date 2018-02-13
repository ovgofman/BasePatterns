package basePatterns.behavioral.visitor;

/**
 * Created by hofa on 13.02.2018.
 */
public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
