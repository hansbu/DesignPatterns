package StructuralPatterns.Template;

public class Soccer extends Game {
    @Override
    public void initialize() {
        System.out.println("Initializing the Soccer game...");
    }

    @Override
    public void start() {
        System.out.println("Soccer game started. Enjoy!");
    }

    @Override
    public void end() {
        System.out.println("Soccer game ended!");

    }
}
