package za.ac.cput.student;

/**
 * Created by student on 2015/02/20.
 */
import java.util.*;

public class StudentClass implements StudentInterface
{
    private List studList;
    private Map studMap;
    private Set studSet;

    @Override
    public String getStudentNum()
    {
        studList = new ArrayList();
        studList.add("212030086");
        String num = (String)studList.get(0);
        return num;
    }
    @Override
    public int getStudentName()
    {
        studSet = new HashSet();
        studSet.add("Mvuyisi");
        studSet.add("Mvuyisi");
        studSet.add("Mvuyisi");
        studSet.add("Mvu");
        int num = (int)studSet.size();
        return num;
    }
    @Override
    public String getStudNameNum() {
        studMap = new HashMap();
        studMap.put("Mvuyisi", "212030086");
        studMap.put("Mvu", "212219855");
        String name = (String) studMap.get("Mvu");
        return name;
    }

}
