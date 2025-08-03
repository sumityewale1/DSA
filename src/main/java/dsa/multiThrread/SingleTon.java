package dsa.multiThrread;

import java.security.Signature;

public class SingleTon {
    private static SingleTon INSTANCE = null;


    public static SingleTon getInstance() {
        if (INSTANCE == null) {

            synchronized (SingleTon.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingleTon();
                    return INSTANCE;
                }
            }
        }
    return INSTANCE;
    }

    public static SingleTon getINSTANCE() {
        return Loader.SINGLE_TON;
    }

    public static final class Loader {
        public  static  final SingleTon SINGLE_TON = new SingleTon();
    }
}
