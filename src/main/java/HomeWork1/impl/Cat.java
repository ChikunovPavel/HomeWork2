package HomeWork1.impl;


import HomeWork1.createinterface.Runnable;
import HomeWork1.parent.Animal;

public class Cat extends Animal implements Runnable {


    public Cat(String name) {
        super(name,null,4);
    }



    @Override
    public void speak() {
        System.out.println("мяу");
    }

    @Override
    public void hunt() {

    }



    public int getRun()
    {return 100;}
}









