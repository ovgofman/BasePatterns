package basePatterns.behavioral.template;

/**
 * Created by hofa on 13.02.2018.
 */
public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
