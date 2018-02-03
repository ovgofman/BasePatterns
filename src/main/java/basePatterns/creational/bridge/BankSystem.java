package basePatterns.creational.bridge;

/**
 * Created by hofa on 03.02.2018.
 */
public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("BankSystem development in progress ... ");
        developer.writeCode();
    }
}
