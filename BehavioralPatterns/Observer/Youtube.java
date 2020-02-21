
package BehavioralPatterns.Observer;


public class Youtube {

    public static void main(String[] args) {

        Subscriber s1 = new Subscriber("s1");
        Subscriber s2 = new Subscriber("S2");
        Subscriber s3 = new Subscriber("s3");

        Channel han = new Channel();
        han.subscribe(s1);
        han.subscribe(s2);
        han.subscribe(s3);

        han.unsubscribe(s2);

        han.uploadVideo("How to learn Java");
    }
}
