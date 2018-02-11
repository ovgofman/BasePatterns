package basePatterns.behavioral.observer;

/**
 * Created by hofa on 11.02.2018.
 */
public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
