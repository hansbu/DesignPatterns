package CreationalPatterns.AbstractFactory;

public class BankFactory extends AbstractFactory {
    @Override
    Bank getBank(String bank) {
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC(bank);
        }else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI(bank);
        }else if(bank.equalsIgnoreCase("SBI")){
            return new SBI(bank);
        }
        return null;
    }

    @Override
    Loan getLoan(String loan) {
        return null;
    }
}
