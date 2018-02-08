package basePatterns.behavioral.command;

/**
 * Created by hofa on 09.02.2018.
 */
public class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
