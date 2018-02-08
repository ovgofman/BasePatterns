package basePatterns.behavioral.command;

/**
 * Created by hofa on 09.02.2018.
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecortd();
        developer.updateRecortd();
        developer.selectRecortd();
        developer.deleteRecortd();
    }
}
