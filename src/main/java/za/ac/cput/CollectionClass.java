package za.ac.cput;

import java.util.ArrayList;
import java.util.Collection;

/* Collection class
   *Author: Siyamtanda Tonjeni
   *        217107958
   *        16 May 2021
 */
public class CollectionClass {

    private Collection<Integer> collTest = new ArrayList<Integer>() ;

    public  int add(int number)
    {
        collTest.add(number);
        return number;
    }
    public  int remove(int number)
    {
        collTest.remove(number);
        return number;
    }
    public  int find(int number)
    {
        collTest.contains(number);
        return number;
    }

    public int sizeOfArray()
    {
        return collTest.size();
    }
}
