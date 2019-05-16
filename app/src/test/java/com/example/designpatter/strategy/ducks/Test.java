package com.example.designpatter.strategy.ducks;

public class Test {
    @org.junit.Test
    public void testDucks() {
        Duck duck = new MallarDuck();
        duck.diplay();
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }
}
