package Project2aadhar;

import java.util.Scanner;

import projectAdhar.adhar;
import projectAdhar.pan;

public class PanAadharMatching {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        AadharService AS=new AadharService();
        PanService PS=new PanService();
        System.out.println("Enter the Aadhar Number");
        String AadharNumber=sc.nextLine(); 
        Aadhar a=AS.getAdharNumber(AadharNumber);
        Pan p=PS.getpanbyaadharnum(AadharNumber);
        
            System.out.println("Aadhaar Details ="+ a);
            System.out.println("Pan Details ="+ p);
            // TODO: handle exception
            
    
    }
}
