import com.inheritance.Animal;
import com.inheritance.Dog;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("com.inheritance.Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorki", 20, 2, 4, 1, 20, 20, "long");
        dog.eat();
        dog.walk();
        dog.move(20);


        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);


    }

}
