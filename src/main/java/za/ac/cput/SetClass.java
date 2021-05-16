package za.ac.cput;
/* Set class
   *Author: Siyamtanda Tonjeni
   *        217107958
   *        16 May 2021
 */
public class SetClass {

    private String animal;
    private int index;

    public SetClass(int index,String animal) {
        this.index = index;
        this.animal = animal;
    }
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getIndex(){return index;}

    public void setIndex(int index){this.index = index;}

    @Override
    public String toString() {
        return "ListClass{" +
                "index='" + index + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }
}
