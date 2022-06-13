package Lesson1.Obstacle;

import Lesson1.Person;

    public class Water extends Obstacle {

        private int length;

        public Water(int length) {
            this.length = length;
        }

        @Override
        public void doIt(Person person) {
            person.swim(length);
        }
    }
