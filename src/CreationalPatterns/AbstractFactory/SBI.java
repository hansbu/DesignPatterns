package CreationalPatterns.AbstractFactory;

public class SBI implements Bank {
    private String BNAME;

    public SBI(String bankName){
        BNAME = bankName;
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
