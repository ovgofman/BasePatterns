package basePatterns.behavioral.observer;

import java.util.List;

/**
 * Created by hofa on 11.02.2018.
 */
public interface Observer {
    public void handleEvent(List<String> vacancies);
}
