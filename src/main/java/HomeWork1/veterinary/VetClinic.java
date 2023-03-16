package HomeWork1.veterinary;

import HomeWork1.createinterface.Flyable;
import HomeWork1.createinterface.Swimable;
import HomeWork1.createinterface.Runnable;
import HomeWork1.createinterface.Dok;

import HomeWork1.parent.Animal;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;



    public VetClinic() {
        this.animals = new ArrayList<>();
    }

    public List<Animal> getAnimals(){
        return  this.animals;
    }

    public VetClinic addAnimal(Animal animal){
        this.animals.add(animal);
        return this;
    }





    public List <Flyable> getFlyghtVet() {
        List<Flyable> fly = new ArrayList<>();
        for (Animal a: this.animals)
             if (a instanceof Flyable)fly.add((Flyable) a);

    return fly;
    }

    public List <Runnable> getRunVet() {
        List<Runnable> run = new ArrayList<>();
        for (Animal a : this.animals)
            if (a instanceof Runnable)run.add((Runnable) a);
    return run;
    }

    public List <Swimable> getSwimVet() {
        List<Swimable> swim = new ArrayList<>();
        for (Animal a : this.animals)
            if (a instanceof Swimable)swim.add((Swimable) a);
    return swim;
    }

    public List <Dok> getDoc() {
        List<Dok> doc = new ArrayList<>();
        for (Animal a : this.animals)
            if (a instanceof Dok)doc.add((Dok) a);
    return doc;
    }








}





