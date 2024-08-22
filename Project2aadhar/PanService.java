package Project2aadhar;
import java.util.HashMap;
import java.util.Map;
public class PanService {
    private  Map<String,Pan> PanMap;
    public PanService(){
        PanMap=new HashMap<>(); 
        PanMap.put("OVPPS8207D", new Pan("OVPPS8207D", "1232332234", "HDFC BANK", "Stock,FD"));
        PanMap.put("KLIPS8207D", new Pan("KLIPS8207D", "1232332264", "SBI BANK", "Stock,FD"));
        PanMap.put("LOHGS8207D", new Pan("LOHGS8207D", "3232332234", "HDFC BANK", "Stock,FD"));
    }
public Pan getpanbyaadharnum(String aadharNumber) {

    for(Pan p : PanMap.values()) {
        if(p.getAdharNumber().equals(aadharNumber)){
            return p;
        }
        
    }
    throw new NullPointerException("No Such Data Found");
}
}
