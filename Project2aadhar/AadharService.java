package Project2aadhar;

import java.util.HashMap;
import java.util.Map;
public class AadharService {
    private Map<String,Aadhar> Aadharmap;
    public AadharService(){
        Aadharmap=new HashMap<>();
        Aadharmap.put("1232332234", new Aadhar("1232332234", "Deepak Singh Suyal", "Nandan Singh Suyal", "9 A Alok Nagar Mohammad pur khatri"));
Aadharmap.put("1232332264", new Aadhar("1232332264", "Manish Singh Suyal", "Nandan Singh Suyal", "9 A Alok Nagar Mohammad pur khatri"));
Aadharmap.put("3232332234", new Aadhar("3232332234", "Abhi Singh Suyal", "Kishan Singh Suyal", "9 A Alok Nagar Mohammad pur khatri"));
    }
    public Aadhar getAdharNumber(String Adharnumber) {
        
            if(null== Aadharmap.get(Adharnumber)){
                throw new NullPointerException("AadharNumber Not Found ");
            }
else{
    return Aadharmap.get(Adharnumber);
}
    }
}
