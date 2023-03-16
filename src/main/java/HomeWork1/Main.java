package HomeWork1;

import HomeWork1.createinterface.Flyable;
import HomeWork1.createinterface.Dok;
import HomeWork1.createinterface.Runnable;
import HomeWork1.createinterface.Swimable;
import HomeWork1.impl.*;
import HomeWork1.parent.Animal;
import HomeWork1.veterinary.Doctor;
import HomeWork1.veterinary.VetClinic;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(null, null, 0) {
            @Override
            public void speak() {
            }
            @Override
            public void hunt() {
            }
        };


        VetClinic vetClinic = new VetClinic();
        vetClinic.addAnimal(new Cat("мурзик"))
            .addAnimal(new dog("бобик"))
            .addAnimal(new duck("дональд"))
            .addAnimal(new Bird("Кеша"))
            .addAnimal(new Eagle("Чак"))
            .addAnimal(new Fish("Немо"))
            .addAnimal(new Shark("Робинзон"))
            .addAnimal(new Doctor("Айболит"));








        System.out.println("Журнал записи");
        for (Animal f: vetClinic.getAnimals()) {
            System.out.println(f);
        }

        System.out.println("Скрость полета");
        for (Flyable f: vetClinic.getFlyghtVet()) {
            System.out.println(f + "\n" + f.getFlyghtSpeed());
        }

        System.out.println("Скрость бега");
        for (Runnable r: vetClinic.getRunVet()) {
            System.out.println(r + "\n" + r.getRun());
        }

        System.out.println("Скрость плавания");
        for (Swimable s: vetClinic.getSwimVet()) {
            System.out.println(s + "\n" + s.getSwim());
        }

        System.out.println("Доктор");
        for (Dok d: vetClinic.getDoc()) {
            System.out.println(d);
        }
    }
}


































