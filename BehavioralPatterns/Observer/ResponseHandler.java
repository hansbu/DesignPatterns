package BehavioralPatterns.Observer;

import java.util.Observable;
import java.util.Observer;


public class ResponseHandler implements Observer {
    private String resp;
    private String name;

    public ResponseHandler(String name) {
        this.name = name;
    }

    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            resp = (String) arg;
            System.out.println("\nHandler " + name + " Received Response: " + resp );
        }
    }
}