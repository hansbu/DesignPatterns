package CreationalPatterns.Singleton;

public class SingletonClassLazy {
    private static SingletonClassLazy obj;
    private SingletonClassLazy() {}

    public static SingletonClassLazy getObj(){
        if(obj == null){
            synchronized (SingletonClassLazy.class){
                if(obj == null){
                    obj = new SingletonClassLazy();
                }
            }
        }
        return obj;
    }


}
