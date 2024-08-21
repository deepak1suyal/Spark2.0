package projectAdhar;

public class pan {
    private String panNumber;
    private String adharNumber;
    private String bankDetail;
    private String Invesment;

    
    public pan(String panNumber, String adharNumber, String bankDetail, String invesment) {
        this.panNumber = panNumber;
        this.adharNumber = adharNumber;
        this.bankDetail = bankDetail;
        Invesment = invesment;
    }
    public String getPanNumber() {
        return panNumber;
    }
    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }
    public String getAdharNumber() {
        return adharNumber;
    }
    public void setAdharNumber(String adharNumber) {
        this.adharNumber = adharNumber;
    }
    public String getBankDetail() {
        return bankDetail;
    }
    public void setBankDetail(String bankDetail) {
        this.bankDetail = bankDetail;
    }
    public String getInvesment() {
        return Invesment;
    }
    public void setInvesment(String invesment) {
        Invesment = invesment;
    }
    @Override
    public String toString() {
        return "pan [panNumber=" + panNumber + ", adharNumber=" + adharNumber + ", bankDetail=" + bankDetail
                + ", Invesment=" + Invesment + "]";
    }
    
}
