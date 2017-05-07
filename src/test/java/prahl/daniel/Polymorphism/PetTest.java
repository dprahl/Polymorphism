package prahl.daniel.Polymorphism;

import org.junit.*;
/**
 * Created by danielprahl on 5/6/17.
 */
public class PetTest {
    Pet myPet;
    @Before
    public void setup() {
        myPet = new Pet("Jones", "DigiPet");
    }

    @Test
    public void getNameTest() {

    }

    @Test
    public void setNameTest() {

    }

    @Test
    public void getTypeTest() {

    }

    @Test
    public void setTypeTest() {

    }

    @Test
    public void speakTest() {

    }

    @Test
    public void compareToTest() {
        //given;
        Pet myOtherPet = new Pet("Smith", "Dragon");

        //when;
        int result = myPet.compareTo(myOtherPet);

        //then;
        Assert.assertTrue(result < 0);
    }

}
