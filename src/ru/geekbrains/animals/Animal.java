package ru.geekbrains.animals;

public class Animal {
    String name;
    int runLimit;
    int jumpLimit;


    public Animal (String name, int runLimit, int jumpLimit)
    {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public void Run(int length)
    {
        if (length <= runLimit && length > 0) {
            System.out.println(name + " Бежит на " + length + " метров");
        } else{
            System.out.println(name + " не может так бежать");
        }
    }

    public void Swim(int length)
    {
        System.out.println(name + " не плавает");
    }

    public void Jump (int heght)
    {
        if (heght <= jumpLimit && heght > 0) {
            System.out.println(name + " прыгает на " + heght + " метра");
        } else{
            System.out.println(name + " не может так прыгать");
        }
    }
}
