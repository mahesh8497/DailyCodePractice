package Java8;





public class SingletonDesignPattern {
private static SingletonDesignPattern instance;

private SingletonDesignPattern() {}

public static SingletonDesignPattern getInstance() {
  if (instance == null) {
      instance = new SingletonDesignPattern(); // not thread-safe
  }
  return instance;
}

}





//public class EagerSingleton {
//    private static final EagerSingleton instance = new EagerSingleton();
//
//    private EagerSingleton() {} // private constructor
//
//    public static EagerSingleton getInstance() {
//        return instance;
//    }
//}





//public class LazySingleton {
//    private static final  LazySingleton instance;
//
//    private LazySingleton() {}
//
//    public static LazySingleton getInstance() {
//        if (instance == null) {
//            instance = new LazySingleton(); // not thread-safe
//        }
//        return instance;
//    }
//}



//public class ThreadSafeSingleton {
//    private static ThreadSafeSingleton instance;
//
//    private ThreadSafeSingleton() {}
//
//    public static synchronized ThreadSafeSingleton getInstance() {
//        if (instance == null) {
//            instance = new ThreadSafeSingleton();
//        }
//        return instance;
//    }
//}




//public class DoubleCheckedSingleton {
//    private static volatile DoubleCheckedSingleton instance;
//
//    private DoubleCheckedSingleton() {}
//
//    public static DoubleCheckedSingleton getInstance() {
//        if (instance == null) {
//            synchronized (DoubleCheckedSingleton.class) {
//                if (instance == null) {
//                    instance = new DoubleCheckedSingleton();
//                }
//            }
//        }
//        return instance;
//    }
//}




//public enum EnumSingleton {
//    INSTANCE;
//
//    public void someMethod() {
//        System.out.println("Doing something...");
//    }
//}




