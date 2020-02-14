package CreationalPatterns.AbstractFactory;

abstract class Loan {
    protected double rate;
    abstract void getInterest(double rate);

    public void calculateLoanPayment(double loanAmount, int tenure){
        System.out.println(String.format("Computing loan for loanAmount of %.2f at rate of %.2f for %d year", loanAmount, rate, tenure));
    }
}
