package Lesson1.animals;

import Lesson1.animals.Animal;

public class Cat extends Animal {

    public Cat(String name, int maxRunDistance,
               int maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    @Override
    public void voice() {
        System.out.println("Ìÿó");
    }
}
