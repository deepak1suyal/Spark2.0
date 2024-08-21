package projectAdhar;

import java.util.HashMap;
import java.util.Map;

public class AadharService {
    private static Map<String,adhar> aadharmap=new HashMap<>();
    static{
aadharmap.put("1232332234", new adhar("1232332234", "Deepak Singh Suyal", "Nandan Singh Suyal", "9 A Alok Nagar Mohammad pur khatri"));
aadharmap.put("1232332264", new adhar("1232332264", "Manish Singh Suyal", "Nandan Singh Suyal", "9 A Alok Nagar Mohammad pur khatri"));
aadharmap.put("3232332234", new adhar("3232332234", "Abhi Singh Suyal", "Kishan Singh Suyal", "9 A Alok Nagar Mohammad pur khatri"));
    }

public adhar getAdharNumber(String Adharnumber){
    return aadharmap.get(Adharnumber);
}


}
