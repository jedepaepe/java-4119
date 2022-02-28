package eu.epfc.lesson10.exercices.animal;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        // illustration du polymorphisme
        Animal[] animals = { cat, dog };
        for (Animal animal : animals) {
            animal.speak();
            animal.sleep();
            System.out.println();
        }
    }
}
