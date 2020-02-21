package BehavioralPatterns.Strategy;

public class MainStrategy {
    public static void main(String[] args){
        float a = 5;
        float b = 9;

        Context context = new Context(new Addition());
        float res = context.executeStrategy(a, b);
        System.out.println(res);
    }
}
