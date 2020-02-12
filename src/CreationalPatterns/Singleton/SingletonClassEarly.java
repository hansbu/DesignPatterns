package CreationalPatterns.Singleton;

public class SingletonClassEarly {
    private static SingletonClassEarly obj = new SingletonClassEarly();
    private int counter = 0;

    private SingletonClassEarly() {};

    public static SingletonClassEarly getObj(){
        return obj;
    }

    public void incrementCounter(int x){
        synchronized (SingletonClassEarly.class) {
            counter += x;
        }
    }

    public int getCounter(){
        synchronized (SingletonClassEarly.class){
            return counter;
        }
    }

}
