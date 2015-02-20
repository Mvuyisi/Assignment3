package za.ac.cput.student;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2015/02/20.
 */
public class StudentSet implements StudSetInterface{
    private Set studSet;

    public static int getStudentName()
    {
        studSet = new HashSet();
        studSet.add("Mvuyisi");
        studSet.add("Mvuyisi");
        studSet.add("Mvuyisi");
        studSet.add("Mvu");
        int num = (int)studSet.size();
        return num;
    }
}
