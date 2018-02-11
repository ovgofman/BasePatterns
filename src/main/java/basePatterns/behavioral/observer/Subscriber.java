package basePatterns.behavioral.observer;

import java.util.List;

/**
 * Created by hofa on 11.02.2018.
 */
public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + " we have some new changes:\n" + vacancies);
        System.out.println("++++++++++++++\n");
    }
}
