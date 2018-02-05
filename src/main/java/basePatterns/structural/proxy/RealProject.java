package basePatterns.structural.proxy;

/**
 * Created by hofa on 05.02.2018.
 */
public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("loading project from " + url + " ...");
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + " ...");
    }
}
