package CreationalPatterns.Singleton;

public class MainSingleton {

    public static void main(String[] args){
        SingletonClassEarly obj1 = SingletonClassEarly.getObj();
        SingletonClassEarly obj2 = SingletonClassEarly.getObj();

        obj1.incrementCounter(5);
        obj2.incrementCounter(10);

        System.out.println("counter from obj1: " + obj1.getCounter());
        System.out.println("counter from obj2: " + obj2.getCounter());

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

    }
}
