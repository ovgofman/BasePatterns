package basePatterns.structural.facade;

/**
 * Created by hofa on 04.02.2018.
 */
public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problem ...");
        } else {
            System.out.println("Developer is reading some news.");
        }
    }
}
