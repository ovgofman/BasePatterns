package basePatterns.structural.decorator;

/**
 * Created by hofa on 03.02.2018.
 */
public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write Java code. ";
    }
}
