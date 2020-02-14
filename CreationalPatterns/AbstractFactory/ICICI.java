package CreationalPatterns.AbstractFactory;

public class ICICI implements Bank {
    private String BNAME;

    public ICICI(String bankName){
        BNAME = bankName;
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
