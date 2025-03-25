package com.patterns.creational.singleton;

public class MySingleton {

//    private static MySingleton mySingleton;

    private MySingleton() {}

    public static MySingleton getInstance() {
//        if (mySingleton == null) {
//            synchronized (MySingleton.class) {
//                if (mySingleton == null) {
//                    return new MySingleton();
//                }
//            }
//        }
//        return mySingleton;
        return MySingletonHelper.MY_SINGLETON;
    }

    // For Bill Pugh singleton
    private static class MySingletonHelper {
        private static final MySingleton MY_SINGLETON = new MySingleton();
    }

}
