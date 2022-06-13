package Lesson1;

public class Person implements Participant{
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;
    private boolean onDistance;

    public Person(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance, boolean onDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(name + " " + " пробежал дистанцию");
        } else {
            System.out.println(name + " " + " не смог пробежать дистанцию");
            onDistance = false;
        }
    }

    public void jump(int height){
        if (height <=maxJumpHeight){
            System.out.println(name + " " + " успешно справился с препятствием");
        } else {
            System.out.println(name + " " + " не смог преодолеть препятствие");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (distance <=maxSwimDistance){
            System.out.println(name + " " + " успешно проплыл дистанцию");
        } else {
            System.out.println(name + " " + " не смог проплыть дистанцию");
            onDistance = false;
        }
    }

    public void showResult(){
        System.out.println(name + ": " + onDistance);
    }
}
