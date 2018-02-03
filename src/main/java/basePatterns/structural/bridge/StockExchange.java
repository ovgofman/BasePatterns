package basePatterns.structural.bridge;

/**
 * Created by hofa on 03.02.2018.
 */
public class StockExchange extends Program {
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("StockExchange development in progress ... ");
        developer.writeCode();
    }
}
