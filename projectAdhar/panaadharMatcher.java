package projectAdhar;

import java.util.Scanner;

public class panaadharMatcher {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    AadharService aadharService=new AadharService();
    panService pa=new panService();
    System.out.println("Enter the Aadhar Number");
    String aadharNumber=sc.nextLine(); 
   adhar a=aadharService.getAdharNumber(aadharNumber);
   pan p=pa.getpanbyaadharnum(aadharNumber);
   if(a!=null&&p!=null){
    System.out.println("Aadhaar Details ="+ a);
    System.out.println("Pan Details ="+ p);
   }
else{
    System.out.println("No Match Found");
}

   } 
}
