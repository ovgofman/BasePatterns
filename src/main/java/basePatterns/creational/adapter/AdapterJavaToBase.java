package basePatterns.creational.adapter;

/**
 * Created by hofa on 02.02.2018.
 */
public class AdapterJavaToBase extends JavaApplication implements DataBase {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
