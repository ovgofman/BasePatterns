package basePatterns.behavioral.command;

/**
 * Created by hofa on 09.02.2018.
 */
public class SelectCommand implements Command {
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
