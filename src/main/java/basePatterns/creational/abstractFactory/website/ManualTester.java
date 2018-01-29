package basePatterns.creational.abstractFactory.website;

import basePatterns.creational.abstractFactory.Tester;

/**
 * Created by hofa on 29.01.2018.
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual QA tests website ...");
    }
}
