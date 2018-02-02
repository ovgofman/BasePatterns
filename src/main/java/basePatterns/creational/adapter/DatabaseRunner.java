package basePatterns.creational.adapter;

/**
 * Created by hofa on 02.02.2018.
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToBase();

        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();
    }
}
