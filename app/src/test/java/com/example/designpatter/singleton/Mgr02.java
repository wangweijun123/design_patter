package com.example.designpatter.singleton;

public class Mgr02 {

    private Mgr02(){}

    public static Mgr02 getInstance() {
        return Mgr02Holder.INSTANCE;
    }

    private static class Mgr02Holder {
        private static final Mgr02 INSTANCE = new Mgr02();
    }
}
