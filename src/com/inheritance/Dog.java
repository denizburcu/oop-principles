package com.inheritance;

public class Dog extends Animal {
    private int eyes;
    private int leg;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int leg, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.leg = leg;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("com.inheritance.Dog.eat() called");
        chew();
    }

    private void chew() {
        System.out.println("com.inheritance.Dog.chew() called");
    }

    public void walk() {
        System.out.println("com.inheritance.Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("com.inheritance.Dog.run() called.");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("com.inheritance.Dog.moveLegs() called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("com.inheritance.Dog.move() called.");
        moveLegs(speed);

   }

}
