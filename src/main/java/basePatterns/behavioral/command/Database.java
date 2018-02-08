package basePatterns.behavioral.command;

/**
 * Created by hofa on 05.02.2018.
 */
public class Database {
    public void insert() {
        System.out.println("Inserting...");
    }

    public void update() {
        System.out.println("Updating...");
    }

    public void select() {
        System.out.println("Reading...");
    }

    public void delete() {
        System.out.println("Deleting...");
    }
}
