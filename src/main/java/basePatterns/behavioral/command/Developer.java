package basePatterns.behavioral.command;

/**
 * Created by hofa on 09.02.2018.
 */
public class Developer {
    Command insert;
    Command update;
    Command select;
    Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertRecortd() {
        insert.execute();
    }

    public void updateRecortd() {
        update.execute();
    }

    public void selectRecortd() {
        select.execute();
    }

    public void deleteRecortd() {
        delete.execute();
    }


}
