package BehavioralPatterns.ChainOfResponsibility;

public class ErrorBasedLogger extends  Logger {
    public ErrorBasedLogger(int levels){
        this.levels = levels;
    }


    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("Error based logger: " + msg);
    }
}
