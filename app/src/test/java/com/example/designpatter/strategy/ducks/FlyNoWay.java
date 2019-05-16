package com.example.designpatter.strategy.ducks;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞不起");
    }
}
