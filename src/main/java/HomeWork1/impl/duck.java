package HomeWork1.impl;

import HomeWork1.createinterface.Flyable;
import HomeWork1.parent.Animal;

public class duck extends Animal implements Flyable {


    public duck(String name) {
        super(name,null,2);
    }



    @Override
    public void speak() {
        System.out.println("кря-кря");
    }

    @Override
    public void hunt() {

    }
    @Override
    public int getFlyghtSpeed() {
        return 10;
    }

}





