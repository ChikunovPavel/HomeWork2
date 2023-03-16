package HomeWork1.veterinary;
import HomeWork1.createinterface.Dok;
import HomeWork1.parent.Animal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Doctor extends Animal implements Dok {

    public Doctor(String name) {
        super(name);
    }



    @Override
    public void hunt() {

    }


    @Override
    public void speak() {

    }


    @Override
    public void getIll() {

    }
}


