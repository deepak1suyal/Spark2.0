package projectAdhar;

public class adhar {
  private  String AdharNumber;
  private  String Name;
  private  String FatherName;
  private  String Address;
  
@Override
public String toString() {
    return "adhar [AdharNumber=" + AdharNumber + ", Name=" + Name + ", FatherName=" + FatherName + ", Address="
            + Address + "]";
}
public adhar(String adharNumber, String name, String fatherName, String address) {
    AdharNumber = adharNumber;
    Name = name;
    FatherName = fatherName;
    Address = address;
}
public String getAdharNumber() {
    return AdharNumber;
}
public void setAdharNumber(String adharNumber) {
    AdharNumber = adharNumber;
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

  
}
