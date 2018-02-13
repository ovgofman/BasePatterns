package basePatterns.behavioral.strategy;

/**
 * Created by hofa on 13.02.2018.
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping ...");
    }
}
