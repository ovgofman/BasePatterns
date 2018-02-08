package basePatterns.behavioral.command;

/**
 * Created by hofa on 09.02.2018.
 */
public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
