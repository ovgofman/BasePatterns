package basePatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hofa on 05.02.2018.
 */
public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {
            switch (specialty) {
                case "java":
                    System.out.println("Hiring java developer ...");
                    developer = new JavaDeveloper();
                    break;
                case "cpp":
                    System.out.println("Hiring cpp developer ... ");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
