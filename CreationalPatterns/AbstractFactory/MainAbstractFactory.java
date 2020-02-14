package CreationalPatterns.AbstractFactory;

public class MainAbstractFactory {
    static public void main(String[] args){
        AbstractFactory bankFactory = FactoryCreator.getFactory("bank");
        Bank b = bankFactory.getBank("HDFC");

        AbstractFactory loanFactory = FactoryCreator.getFactory("loan");
        Loan l = loanFactory.getLoan("Bussiness");
        l.getInterest(1.2);
        l.calculateLoanPayment(100, 10);

        System.out.println("bank name: " + b.getBankName());

    }
}
