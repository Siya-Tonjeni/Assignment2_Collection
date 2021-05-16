package za.ac.cput;

import java.util.HashMap;
import java.util.Map;

/* Map class
   *Author: Siyamtanda Tonjeni
   *        217107958
   *        16 May 2021
 */

public class MapClass {

    private Map <Integer , String> map = new HashMap();

    public  String add(int index, String firstname)
    {
        map.put(index, firstname);
        return firstname;
    }
    public  String remove(int index, String firstname)
    {
        map.remove(index, firstname);
        return firstname;
    }
    public  String find(int index, String firstname)
    {
        map.containsKey(firstname);
        return firstname;
    }

    public int sizeOfArray()
    {
        return map.size();
    }
}
