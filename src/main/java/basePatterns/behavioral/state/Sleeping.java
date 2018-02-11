package basePatterns.behavioral.state;

/**
 * Created by hofa on 11.02.2018.
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping ...");
    }
}
