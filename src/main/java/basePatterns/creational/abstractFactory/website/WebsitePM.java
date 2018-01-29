package basePatterns.creational.abstractFactory.website;

import basePatterns.creational.abstractFactory.ProjectManager;

/**
 * Created by hofa on 29.01.2018.
 */
public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project ...");
    }
}
