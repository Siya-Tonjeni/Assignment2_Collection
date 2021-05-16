package za.ac.cput;

import java.time.LocalDate;

/* List class
   *Author: Siyamtanda Tonjeni
   *        217107958
   *        16 May 2021
 */

public class ListClass {

    private String firstname, lastname;
    private int index , studentNo;

    public ListClass(int index,String firstname, String lastname, int studentNo) {
        this.index = index;
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentNo = studentNo;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getIndex(){return index;}

    public void setIndex(int index){this.index = index;}

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    @Override
    public String toString() {
        return "ListClass{" +
                "index='" + index + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + studentNo+
                '}';
    }
}
