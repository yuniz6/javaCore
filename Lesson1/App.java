package Lesson1;

import Lesson1.animals.Cat;
import Lesson1.animals.Dog;
import Lesson1.obstacles.*;

public class App {
    public static void main(String[] args) {

        Course c = new Course(new Obstacle[] {
                new Cross(5),
                new Wall(3),
                new Water(7)
        }); // ������� ������ �����������
        Team team = new Team("������",
                new Cat("������", 10, 12, 0),
                new Dog("������", 20, 5, 15),
                new Cat("������", 9, 14, 0),
                new Robot("������", 50, 50, 50));  // ������� �������
        team.getTeamInfo();

        c.doIt(team);               // ������ ������� ������ ������
        team.showResults();         // ���������� ����������

    }
}
