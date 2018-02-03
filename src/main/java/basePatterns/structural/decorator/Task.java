package basePatterns.structural.decorator;

/**
 * Created by hofa on 03.02.2018.
 */
public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
