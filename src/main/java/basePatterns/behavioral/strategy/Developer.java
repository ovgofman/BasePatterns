package basePatterns.behavioral.strategy;

/**
 * Created by hofa on 13.02.2018.
 */
public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
