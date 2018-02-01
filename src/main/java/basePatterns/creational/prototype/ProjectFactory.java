package basePatterns.creational.prototype;

/**
 * Created by hofa on 01.02.2018.
 */
public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public ProjectFactory setProject(Project project) {
        this.project = project;
        return this;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }
}
