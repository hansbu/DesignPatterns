package StructuralPatterns.Template;

public class MainTemplate {
    public static void main(String[] args){
        Game game = new Chess();
        game.play();

        game = new Soccer();
        game.play();

    }
}
