package prahl.daniel.Polymorphism;

import java.util.Comparator;

/**
 * Created by danielprahl on 5/6/17.
 */
public class PetTypeComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet o1, Pet o2) {
        return (o1.getType().compareToIgnoreCase(o2.getType()));
    }
}
