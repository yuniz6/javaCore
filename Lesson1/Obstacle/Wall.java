package Lesson1.Obstacle;

import Lesson1.Person;

public class Wall extends Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Person person) {
        person.jump(height);
    }
}
