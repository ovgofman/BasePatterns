package basePatterns.creational.builder;

/**
 * Created by hofa on 01.02.2018.
 */
public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit Card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);

    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
