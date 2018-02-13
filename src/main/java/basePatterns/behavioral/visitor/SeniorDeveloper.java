package basePatterns.behavioral.visitor;

/**
 * Created by hofa on 13.02.2018.
 */
public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting classes after junior ...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database ...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Rewriting reliable tests ...");
    }
}
