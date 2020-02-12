package CreationalPatterns.AbstractFactory;

class HomeLoan extends Loan {
    @Override
    void getInterest(double r) {
        rate = r;
    }
}
