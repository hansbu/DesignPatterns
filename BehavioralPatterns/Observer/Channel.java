
package BehavioralPatterns.Observer;


import java.util.ArrayList;
import java.util.List;

public class Channel {

    private String title;
    private List<Subscriber> subs = new ArrayList<>();

    public void subscribe(Subscriber sub){
        subs.add(sub);
        sub.subscribe(this);
    }

    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
        sub.unsubscribe();
    }

    public void notifySubs(){
        for(Subscriber sub:subs){
            System.out.println("Hey " + sub.getName() + ", new video uploaded: " + title);
        }
    }

    public void uploadVideo(String videoName){
        title = videoName;
        notifySubs();
    }


}
