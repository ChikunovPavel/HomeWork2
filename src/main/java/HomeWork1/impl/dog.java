package HomeWork1.impl;

import HomeWork1.createinterface.Runnable;
import HomeWork1.parent.Animal;

public class dog extends Animal implements Runnable {


    public dog(String name) {
        super(name,null,4);
    }



    @Override
    public void speak() {
        System.out.println("гав-гав");
    }

    @Override
    public void hunt() {

    }


    @Override
    public int getRun() {

        return 100;
    }
}







