package za.ac.cput.student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/20.
 */
public class StudentList implements StudListInterface{
    private List studList;
    @Override
    public static String getStudentNum()
    {
        studList = new ArrayList();
        studList.add("212030086");
        String num = (String)studList.get(0);
        return num;
    }
}
