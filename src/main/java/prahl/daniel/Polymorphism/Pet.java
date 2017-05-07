package prahl.daniel.Polymorphism;

import java.util.Comparator;

/**
 * Created by danielprahl on 5/2/17.
 */
public class Pet implements Comparable<Pet> {

    private String name;
    private String type;

    public Pet(String name, String type) {
        setName(name);
        setType(type);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public void speak(){
        System.out.println(getName() +" the "+ getType() +" begins to speak in the secret "+ getType() +" tongue.");
    }

    @Override
    public int compareTo(Pet o) {
        return (this.getName().compareToIgnoreCase(o.getName()));
    }

}
