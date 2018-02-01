package basePatterns.creational.builder;

/**
 * Created by hofa on 01.02.2018.
 */
public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new
                EnterpriceWebsiteBuilder());

        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
