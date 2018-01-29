package basePatterns.creational.factory;

/**
 * Created by hofa on 25.12.2017.
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}

