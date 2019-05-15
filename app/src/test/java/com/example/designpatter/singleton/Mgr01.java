package com.example.designpatter.singleton;

public class Mgr01 {
    private final static Mgr01 INSTANCE = new Mgr01();

    private Mgr01(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }
}
