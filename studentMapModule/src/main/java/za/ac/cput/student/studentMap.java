package za.ac.cput.student;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/02/20.
 */
public class studentMap implements studentMapInterface{
    private Map studMap;
    @Override
    public static String getStudNameNum() {
        studMap = new HashMap();
        studMap.put("Mvuyisi", "212030086");
        studMap.put("Mvu", "212219855");
        String name = (String) studMap.get("Mvu");
        return name;
    }
}
