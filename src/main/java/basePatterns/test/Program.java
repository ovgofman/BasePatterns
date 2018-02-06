package basePatterns.test;

/**
 * Created by hofa on 05.02.2018.
 */
public class Program {
    public static void main(String[] args) {
        Program program = new Program();
        program.countSits(new Bmw());
        program.useCar(new Car());
    }

    void useCar(Car car) {
        System.out.println(car.getSpeed());
    }

    void countSits(Bmw bmw) {
        System.out.println(bmw.getDoors());
    }
}
