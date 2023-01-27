package com.zlateva;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic animal", "Huge", 400);
        doAnimalStaff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStaff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStaff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, " Floppy", "Swimmer");
        doAnimalStaff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStaff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStaff(goldie, "fast");
    }

    public static void doAnimalStaff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("______");
    }
}