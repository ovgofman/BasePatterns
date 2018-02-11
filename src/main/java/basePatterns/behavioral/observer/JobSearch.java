package basePatterns.behavioral.observer;

/**
 * Created by hofa on 11.02.2018.
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSites jobSite = new JavaDeveloperJobSites();

        jobSite.addVacancy("Java dev");
        jobSite.addVacancy("Fullstack java");

        Observer firstSubscriber = new Subscriber("Alex Gofman");
        Observer secondSubscriber = new Subscriber("OG");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Java Lead");
        jobSite.removeVacancy("Java dev");
    }
}
