package basePatterns.behavioral.visitor;

/**
 * Created by hofa on 13.02.2018.
 */
public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor classes ...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Dropping database ...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable tests ...");
    }
}
