package basePatterns.creational.abstractFactory.banking;

import basePatterns.creational.abstractFactory.Developer;

/**
 * Created by hofa on 29.01.2018.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JavaDev writes java code ...");
    }
}
