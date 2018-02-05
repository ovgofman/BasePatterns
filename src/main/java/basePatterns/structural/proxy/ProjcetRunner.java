package basePatterns.structural.proxy;

/**
 * Created by hofa on 05.02.2018.
 */
public class ProjcetRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/ovgofman/BasePatterns.git");

        project.run();
    }
}
