package HomeWork1.impl;

import HomeWork1.createinterface.Swimable;
import HomeWork1.parent.Animal;

public class Fish extends Animal implements Swimable {


    public Fish(String name) {
        super(name,null,0);
    }

    @Override
    public void speak() {
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getSwim() {
        return 40;

    }



}




