package prahl.daniel.Polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by danielprahl on 5/6/17.
 */
public class PetQueryTest {
    PetQuery query;
    Pet[] pets;
    Pet pet1;
    Pet pet2;
    Pet pet3;

    @Before
    public void setup(){
        query = new PetQuery();
        pet1 = new Pet("arnold", "turtle");
        pet2 = new Pet("samuel", "zebra");
        pet3 = new Pet("Zachary", "Bear");
        pets = new Pet[]{pet1, pet2, pet3};
    }

    @Test
    public void beginQueryTest(){

    }

    @Test
    public void askPetCountTest(){

    }

    @Test
    public void gatherInfoTest(){

    }

    @Test
    public void askSpeciesTest(){

    }

    @Test
    public void askNameTest(){

    }

    @Test
    public void getNthTest(){
        //given;
        String expected = "6th";

        //when;
        String actual = query.getNth(5); // pass in 5 to account for zero indexing

        //then;
        System.out.println(query.getNth(5));
        Assert.assertTrue(expected.equals(actual));

    }

    @Test
    public void setPetCountTest(){

    }

    @Test
    public void sortByNameTest(){

    }

    @Test
    public void sortByTypeTest(){

    }

    @Test
    public void printPetListTest(){

    }

}
