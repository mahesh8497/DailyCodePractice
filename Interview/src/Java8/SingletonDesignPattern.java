package Java8;


 class SingleTon {
	 private static SingleTon Instance;
	    private SingleTon(){
	        
	    }
	    public static SingleTon getInstance(){
	        if(Instance==null){
	        Instance=new SingleTon();
	    }
	    return Instance;
	}
	}
	public class SingletonDesignPattern {
	    public static void main(String[] args) {
	        SingleTon ss= SingleTon.getInstance();
	        System.out.println(ss);
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




