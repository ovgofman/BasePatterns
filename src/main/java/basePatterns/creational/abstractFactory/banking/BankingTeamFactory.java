package basePatterns.creational.abstractFactory.banking;

import basePatterns.creational.abstractFactory.*;

/**
 * Created by hofa on 29.01.2018.
 */
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }

}
