package basePatterns.creational.abstractFactory;

import basePatterns.creational.abstractFactory.banking.BankingTeamFactory;

/**
 * Created by hofa on 29.01.2018.
 */
public class BankingProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating BANK system ...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
