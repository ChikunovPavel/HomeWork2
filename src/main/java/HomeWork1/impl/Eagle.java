package HomeWork1.impl;


import HomeWork1.createinterface.Flyable;
import HomeWork1.parent.Animal;

public class Eagle extends Animal implements Flyable {

    public Eagle(String name) {
        super(name,null,2);
    }



    @Override
    public void speak() {

    }

    @Override
    public void hunt() {

    }
    @Override
    public int getFlyghtSpeed() {
        return 100;
    }


}



