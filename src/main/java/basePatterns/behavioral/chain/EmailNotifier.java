package basePatterns.behavioral.chain;

/**
 * Created by hofa on 08.02.2018.
 */
public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
