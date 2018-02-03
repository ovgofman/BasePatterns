package basePatterns.structural.facade;

/**
 * Created by hofa on 04.02.2018.
 */
public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active");
        activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint isn't active");
        activeSprint = false;
    }
}
