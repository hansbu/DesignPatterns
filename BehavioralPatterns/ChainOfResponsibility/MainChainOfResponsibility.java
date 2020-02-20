package BehavioralPatterns.ChainOfResponsibility;


public class MainChainOfResponsibility {
    private static Logger doChaining(){
        Logger chainLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFOR);
        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);

        chainLogger.setLogger(errorLogger);
        errorLogger.setLogger(debugLogger);
        return chainLogger;
    }

    public static void main(String[] args){
        Logger chainLogger = doChaining();
        chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the value");
        chainLogger.logMessage(Logger.ERRORINFOR, "Got error");
        chainLogger.logMessage(Logger.DEBUGINFO, "debug completed");
    }
}
