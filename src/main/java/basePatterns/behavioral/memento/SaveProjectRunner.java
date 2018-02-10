package basePatterns.behavioral.memento;

/**
 * Created by hofa on 10.02.2018.
 */
public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("Creating new project: 1.0");
        project.setVersionAndDate("V1.0");
        System.out.println(project);

        System.out.println("Save current to github");
        github.setSave(project.save());
        System.out.println("Update to V1.1");
        System.out.println("Writing some code ...");
        project.setVersionAndDate("set version: V1.1");
        System.out.println(project);

        System.out.println("Something went wrong...");
        System.out.println("rollback");
        project.load(github.getSave());
        System.out.println("Project after rollback");
        System.out.println(project);
    }
}
