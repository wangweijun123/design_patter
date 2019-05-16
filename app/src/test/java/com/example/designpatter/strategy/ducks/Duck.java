package com.example.designpatter.strategy.ducks;

public class Duck {
    // 飞的行为,delegete 委托给接口
    private FlyBehavior flyBehavior;
    // 叫的行为(Duck可能有这些行为，所以只能抽象出这些行为)
    private QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 所有的鸭子能游泳
     */
    public void swim() {

    }

    /**
     * 所有鸭子都有自己的颜色
     */
    public void diplay() {

    }

    public void performFly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }
}
