package basePatterns.behavioral.visitor;

/**
 * Created by hofa on 13.02.2018.
 */
public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement e : projectElements) {
            e.beWritten(developer);
        }
    }
}
