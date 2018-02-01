package basePatterns.creational.builder;

/**
 * Created by hofa on 01.02.2018.
 */
public class Website {
    private String name;
    private Cms cms;
    private int price;

    public Website setName(String name) {
        this.name = name;
        return this;
    }

    public Website setCms(Cms cms) {
        this.cms = cms;
        return this;
    }

    public Website setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }
}
