package BehavioralPatterns.Template;

public class Chess extends Game {

    @Override
    public void initialize() {
        System.out.println("Initializing the Chess game...");
    }

    @Override
    public void start() {
        System.out.println("Chess game started. Enjoy!");
    }

    @Override
    public void end() {
        System.out.println("Chess game ended!");

    }
}
