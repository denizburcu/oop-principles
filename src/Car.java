public class Car extends Vehicle {
    private int wheels;
    private int doours;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doours, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doours = doours;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear() : Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        Move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }
}
