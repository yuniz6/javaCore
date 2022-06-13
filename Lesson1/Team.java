package Lesson1;

import Lesson1.Obstacle.Obstacle;

public class Team {

    private String name;
    private Person[] person;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Person[] person) {
        this.name = name;
        this.person = person;
    }

    public String getName() {
        return "Имя команды: " + teamName;
    }

    public void showResults() {
        for (Person c : person) {
            c.showResult();
        }
    }

    public void doIt(Obstacle obstacle){
        for (Person person : person) {
            obstacle.doIt(person);
            if (!person.isOnDistance()) {
                break;
            }
        }
    }
}
