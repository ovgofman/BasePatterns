package basePatterns.creational.builder;

/**
 * Created by hofa on 01.02.2018.
 */
public class EnterpriceWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprice");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(5000);
    }
}
