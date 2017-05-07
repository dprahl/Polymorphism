package prahl.daniel.Polymorphism;

/**
 * Created by danielprahl on 5/2/17.
 */
public class Cat extends Pet {

    public Cat(String name){
        super(name, "cat");
    }

    @Override
    public void speak(){
        System.out.println(getName() + " the " + getType() + " lets out a few meows");
    }

}
