package Lesson1;

import Lesson1.Obstacle.*;

public class Main {
    public static void main(String[] args) {

        Course c = new Course(new Obstacle[]{
                new Cross(5),
                new Wall(3),
                new Water(7),

                Team team = new Team("TeamJC"),
        new Person("���1", 100, 7, 25),
        new Person("���2", 350, 8, 27);
        new Person("���3", 500, 3, 57);
        new Person("���4", 700, 13, 33);



        team.doIt();
        team.showResults();
    }
    }
}