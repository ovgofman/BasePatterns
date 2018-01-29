package basePatterns.creational.abstractFactory;

/**
 * Created by hofa on 29.01.2018.
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
