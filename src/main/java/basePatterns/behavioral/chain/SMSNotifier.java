package basePatterns.behavioral.chain;

/**
 * Created by hofa on 08.02.2018.
 */
public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to Database manager: " + message);
    }
}
