package CreationalPatterns.AbstractFactory;

public class FactoryCreator {
    static public AbstractFactory getFactory(String choice){
        if(choice == null){
            return null;
        }

        if(choice.equalsIgnoreCase("bank")){
            return new BankFactory();
        }else if(choice.equalsIgnoreCase("loan")){
            return new LoanFactory();
        }
        return null;

    }
}
