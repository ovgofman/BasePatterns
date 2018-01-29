package basePatterns.creational.abstractFactory.website;

import basePatterns.creational.abstractFactory.Developer;

/**
 * Created by hofa on 29.01.2018.
 */
public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code ...");
    }
}
