package za.ac.cput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/* Test all collection class
  * Author: Siyamtanda Tonjeni
  *         217107958
  *        16 May 2021
 */
public class TestCollection {

    @Test
    public void listTest(){

        List<ListClass> classList = new LinkedList<>();

        classList.add(new ListClass(1 , "Siyamtanda","Tonjeni", 217107958));
        classList.add(new ListClass(2 , "James", "Smith", 210794867));

        ListClass siya = new ListClass(2 , "James", "Smith", 210794867);
        ListClass zonke = new ListClass(0, "Zonke", "May", 219367480);
        if (classList.contains(siya))
        {
            Assertions.assertSame(2 , siya );
        }
        else if(classList.remove(siya))
        {
            Assertions.assertEquals(2 , siya);
        }
        else if(classList.add(zonke))
        {
            Assertions.assertSame(zonke , zonke);
        }

    }

    @Test
    public void setTest(){
        HashSet<SetClass> classSet = new HashSet<>();

        classSet.add(new SetClass(1 , "Lion"));
        classSet.add(new SetClass(2 , "Dog"));

        SetClass dog = new SetClass(2 , "Dog");
        SetClass cat = new SetClass(0, "Cat");
        if (classSet.contains(dog))
        {
            Assertions.assertSame(2 , dog );
        }
        else if(classSet.remove(dog))
        {
            Assertions.assertEquals(2 , dog);
        }
        else if(classSet.add(cat))
        {
            Assertions.assertSame(cat , cat);
        }
    }

    @Test
    public void collTest(){

        CollectionClass classColl = new CollectionClass();

        classColl.add(10);
        classColl.add(20);
        classColl.add(30);
        Assertions.assertEquals(3,classColl.sizeOfArray()," The numbers have been added");

        classColl.remove(30);
        Assertions.assertEquals(2,classColl.sizeOfArray(), " Number has been removed");

        classColl.find(10);
        classColl.find(30);
        Assertions.assertEquals(2, classColl.sizeOfArray(), "Both numbers have been found");

    }

    @Test
    public void mapTest(){

        MapClass classMap = new MapClass();

        classMap.add(1,"Siyamtanda");
        classMap.add(2,"Mila");
        classMap.add(3,"Aluta");
        Assertions.assertEquals(3, classMap.sizeOfArray(),"Firstname's have been added");

        classMap.remove(2,"Mila");
        classMap.remove(3,"Aluta");
        Assertions.assertEquals(1, classMap.sizeOfArray(),"Firstname's have been removed");

        classMap.find(1, "Siyamtanda");
        Assertions.assertEquals(1, classMap.sizeOfArray(),"Firstname has been found");
    }
}
