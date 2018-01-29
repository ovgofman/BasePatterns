package basePatterns.creational.abstractFactory.website;

import basePatterns.creational.abstractFactory.Developer;
import basePatterns.creational.abstractFactory.ProjectManager;
import basePatterns.creational.abstractFactory.ProjectTeamFactory;
import basePatterns.creational.abstractFactory.Tester;

/**
 * Created by hofa on 29.01.2018.
 */
public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
