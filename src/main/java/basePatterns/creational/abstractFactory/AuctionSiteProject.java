package basePatterns.creational.abstractFactory;

import basePatterns.creational.abstractFactory.website.WebsiteTeamFactory;

/**
 * Created by hofa on 29.01.2018.
 */
public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating AUCTION site ...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
