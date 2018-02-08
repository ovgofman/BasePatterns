package basePatterns.behavioral.chain;

/**
 * Created by hofa on 05.02.2018.
 */
public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public Notifier setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
        return this;
    }

    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}