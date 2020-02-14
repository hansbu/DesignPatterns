package CreationalPatterns.AbstractFactory;

abstract public class AbstractFactory {
    abstract Bank getBank(String bank);
    abstract Loan getLoan(String loan);
}
