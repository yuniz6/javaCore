package Lesson1;

import Lesson1.animals.Animal;
import Lesson1.animals.Cat;
import Lesson1.animals.Dog;
import Lesson1.obstacles.Obstacle;

public class Team {
    private String name;// �������� �������
    private Participant participants[] ;    // ���������

    public Team(String name) {
        this.name = name;
    }

    public Team(String name,Participant ... participantsGiven ) {
        this.name = name;
        this.participants = participantsGiven;
    }

    public void getTeamInfo() {
        System.out.println("�������: " + this.name );
        for (Participant participant : participants) {
            if (participant instanceof Dog) {
                System.out.println("������ " + participant.getName());
            }
            if (participant instanceof Cat) {
                System.out.println("��� " + participant.getName());
            }
            if (participant instanceof Robot) {
                System.out.println("����� " + participant.getName());
            }
        }
    }

    public void showResults(){
        for (Participant participant : participants) {
            //obstacle.doIt(participant);
            if (!participant.isOnDistance()) {
                break;
            }
        }
    }
    public void doIt(Obstacle obstacle){
        for (Participant participant : participants) {
            obstacle.doIt(participant);
            /*if (!participant.isOnDistance()) {
                break;
            }*/
        }
    }

}
