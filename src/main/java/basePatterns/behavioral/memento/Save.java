package basePatterns.behavioral.memento;

import java.util.Date;

/**
 * Created by hofa on 10.02.2018.
 */
public class Save {
    private final String version;
    private final Date date;

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
