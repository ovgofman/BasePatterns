package basePatterns.behavioral.visitor;

/**
 * Created by hofa on 13.02.2018.
 */
public interface Developer {
    public void create(ProjectClass projectClass);
    public void create(Database database);
    public void create(Test test);
}
