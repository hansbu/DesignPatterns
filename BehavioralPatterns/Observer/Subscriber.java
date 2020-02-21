
package BehavioralPatterns.Observer;


public class Subscriber {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void unsubscribe(){
        channel = null;
    }

    public void subscribe(Channel channel){
        this.channel = channel;
    }
}
