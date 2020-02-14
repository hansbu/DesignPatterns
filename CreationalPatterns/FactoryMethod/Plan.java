package CreationalPatterns.FactoryMethod;

abstract public class Plan {
    protected double rate;
    void calculateBill(int units){
        System.out.println("The bill is: " + units*rate);
    }
}
