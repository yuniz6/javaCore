package Lesson1.obstacles;

import Lesson1.Team;
import Lesson1.Participant;

public class Course {
    private Obstacle obstacles[];

    public Course(Obstacle ... obstacles) {
        this.obstacles = obstacles;
    }
    public void doIt(Team team){
        for (Obstacle obstacle : obstacles) {
            team.doIt(obstacle);
            //obstacle.doIt(team);
        }
    }
}