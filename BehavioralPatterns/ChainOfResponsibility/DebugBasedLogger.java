package BehavioralPatterns.ChainOfResponsibility;

public class DebugBasedLogger extends Logger {
    public DebugBasedLogger(int levels){
        this.levels = levels;
    }


    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("Debug based logger: " + msg);
    }
}
