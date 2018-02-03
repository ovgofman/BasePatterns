package basePatterns.structural.decorator;

/**
 * Created by hofa on 03.02.2018.
 */
public class DeveloperDecorator implements Developer {
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
