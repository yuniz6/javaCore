package Lesson1.animals;

import Lesson1.Participant;

public abstract class Animal implements Participant {

    private String name;
    private boolean onDistance;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;

    public Animal(String name, int maxRunDistance,
                  int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }



    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public String getName() {
        return this.name;
    }
    public abstract void voice();

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " ������� �������� �����");
        } else {
            System.out.println(name + " �� ��������� � �������");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " ������� ����������� �����");
        } else {
            System.out.println(name + " �� ��������� � �������");
            onDistance = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " �� ����� �������");
            onDistance = false;
        } else if (distance <= maxSwimDistance) {
            System.out.println(name + " ������� ��������");
        } else {
            System.out.println(name + " �� ���� ���������");
            onDistance = false;
        }
    }

    @Override
    public String toString() {
        return name + " : " + (isOnDistance() ? "�� ���������" : "����� � ���������");
    }
}
