package prahl.daniel.Polymorphism;

/**
 * Created by danielprahl on 5/2/17.
 */
public class Rock extends Pet {

    public Rock(String name){
        super(name, "rock");
    }

    @Override
    public void speak(){
        System.out.println(getName() + " the pet " + getType() + " doesn't say anything. Cause it's a rock.");
    }

}
