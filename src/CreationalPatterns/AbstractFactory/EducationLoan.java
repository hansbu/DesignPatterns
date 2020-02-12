package CreationalPatterns.AbstractFactory;

class EducationLoan extends Loan {
    @Override
    void getInterest(double r) {
        rate = r;
    }
}
