package CreationalPatterns.AbstractFactory;

class BussinessLoan extends Loan{
    @Override
    public void getInterest(double r) {
        rate = r;
    }
}
