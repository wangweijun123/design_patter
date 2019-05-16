package com.example.designpatter.strategy.ducks;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
