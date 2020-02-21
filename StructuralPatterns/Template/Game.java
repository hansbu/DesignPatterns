package StructuralPatterns.Template;

public abstract class Game {
    public abstract void initialize();
    public abstract void start();
    public abstract void end();

    public final void play(){
        initialize();
        start();
        end();
    }
}
