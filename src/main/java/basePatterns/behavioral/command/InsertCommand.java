package basePatterns.behavioral.command;

/**
 * Created by hofa on 09.02.2018.
 */
public class InsertCommand implements Command {
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
