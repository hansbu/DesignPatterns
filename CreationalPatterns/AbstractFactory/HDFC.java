package CreationalPatterns.AbstractFactory;

public class HDFC implements Bank {
    private String BNAME;

    HDFC(String bankName){
        BNAME = bankName;
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
