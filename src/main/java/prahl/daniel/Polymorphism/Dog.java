package prahl.daniel.Polymorphism;

/**
 * Created by danielprahl on 5/2/17.
 */
public class Dog extends Pet {

    public Dog(String name){
        super(name, "dog");
    }

    @Override
    public void speak(){
        System.out.println(getName() + " the " + getType() + " barks a few times.");
    }


}
