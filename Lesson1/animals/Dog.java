package Lesson1.animals;

import Lesson1.animals.Animal;

public class Dog extends Animal {

    public Dog(String name, int maxRunDistance,
               int maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    @Override
    public void voice() {
        System.out.println("���");
    }

    public void swim() {
        System.out.println(getName() + " ������");
    }
}
