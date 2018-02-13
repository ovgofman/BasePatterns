package basePatterns.behavioral.template;

/**
 * Created by hofa on 13.02.2018.
 */
public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();
        
        welcomePage.showPage();
        newsPage.showPage();

    }
}
