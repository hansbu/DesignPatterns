package StructuralPatterns.Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        System.out.println("Enter Text >");

        // create an event source - reads from stdin
        final EventSource eventSource = new EventSource();

        // create first observer
        final ResponseHandler responseHandler1 = new ResponseHandler("H1");
        // create second observer
        final ResponseHandler responseHandler2 = new ResponseHandler("H2");

        // subscribe the observer to the event source
        eventSource.addObserver(responseHandler1);
        // subscribe the observer to the event source
        eventSource.addObserver(responseHandler2);


        // starts the event thread
        Thread thread = new Thread(eventSource);
        thread.start();
    }
}