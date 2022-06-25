package Lesson1.obstacles;

import Lesson1.Participant;
import Lesson1.animals.Animal;

public class Cross extends Obstacle {

    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant animal) {
        animal.run(length);
    }
}
