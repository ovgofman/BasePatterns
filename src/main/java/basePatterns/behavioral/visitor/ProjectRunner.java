package basePatterns.behavioral.visitor;

/**
 * Created by hofa on 13.02.2018.
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in action:");
        project.beWritten(junior);

        System.out.println();

        System.out.println("Senior in action:");
        project.beWritten(senior);
    }
}