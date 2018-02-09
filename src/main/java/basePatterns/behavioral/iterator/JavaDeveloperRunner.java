package basePatterns.behavioral.iterator;

/**
 * Created by hofa on 09.02.2018.
 */
public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Cat", "Car", "Bus", "Lego"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("OG", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Dev: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + ", ");
        }
    }
}
