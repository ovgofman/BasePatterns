package basePatterns.factory;

/**
 * Created by hofa on 25.12.2017.
 */
public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
