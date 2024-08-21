package projectAdhar;

import java.util.HashMap;
import java.util.Map;

public class panService {
  private static Map<String,pan> panMap=new HashMap<>();
  
  static{
    panMap.put("OVPPS8207D", new pan("OVPPS8207D", "1232332234", "HDFC BANK", "Stock,FD"));
    panMap.put("KLIPS8207D", new pan("KLIPS8207D", "1232332264", "SBI BANK", "Stock,FD"));
    panMap.put("LOHGS8207D", new pan("LOHGS8207D", "3232332234", "HDFC BANK", "Stock,FD"));
  }
public pan getpanbyaadharnum(String aadharNumber){
    for (pan p : panMap.values()) {
        if(p.getAdharNumber().equals(aadharNumber)){
            return p;
        }
        
    }
    return null;
}
}
