package basePatterns.behavioral.chain;

/**
 * Created by hofa on 08.02.2018.
 */
public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifier using simple report: " + message);
    }
}
