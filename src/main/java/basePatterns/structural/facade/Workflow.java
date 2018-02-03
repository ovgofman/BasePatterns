package basePatterns.structural.facade;

/**
 * Created by hofa on 04.02.2018.
 */
public class Workflow {
    Job job = new Job();
    Developer developer = new Developer();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
