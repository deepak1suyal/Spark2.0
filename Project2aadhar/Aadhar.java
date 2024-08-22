package Project2aadhar;

public class Aadhar {
    private  String AadharNumber;
    private  String Name;
    private  String FatherName;
    private  String Address;
    
    public Aadhar(String aadharNumber, String name, String fatherName, String address) {
        AadharNumber = aadharNumber;
        Name = name;
        FatherName = fatherName;
        Address = address;
    }
    public String getAadharNumber() {
        return AadharNumber;
    }
    public void setAadharNumber(String aadharNumber) {
        AadharNumber = aadharNumber;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getFatherName() {
        return FatherName;
    }
    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    @Override
    public String toString() {
        return "Aadhar [AadharNumber=" + AadharNumber + ", Name=" + Name + ", FatherName=" + FatherName + ", Address="
                + Address + "]";
    }
    
    
}
