package HomeWork1.impl;

import HomeWork1.createinterface.Flyable;
import HomeWork1.parent.Animal;

public class Bird extends Animal implements Flyable {


    public Bird(String name) {
        super(name,null,2);
    }




    @Override
    public void speak() {
        System.out.println("Кар-кар");
    }
    @Override
    public void hunt() {
    }

    @Override
    public int getFlyghtSpeed() {
        return 1000;
    }







}




