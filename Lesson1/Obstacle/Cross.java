package Lesson1.Obstacle;

import Lesson1.Person;

public class Cross extends Obstacle {

    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Person person) {
        person.run(length);
    }
}
