package basePatterns.creational.abstractFactory.banking;

import basePatterns.creational.abstractFactory.ProjectManager;

/**
 * Created by hofa on 29.01.2018.
 */
public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("PM manages project ...");
    }
}
