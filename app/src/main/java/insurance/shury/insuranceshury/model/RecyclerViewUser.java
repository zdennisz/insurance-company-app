package insurance.shury.insuranceshury.model;

public class RecyclerViewUser {

    //------------------------------------- Parameters ------------------------------------------
    private String userLastName;
    private String userFirstName;
    private String dateOfPurchase;
    private String userRemarks;
    private String typeOfInsurance;
    //------------------------------------- Getters & Setters ------------------------------------------

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public String getUserRemarks() {
        return userRemarks;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public void setUserRemarks(String userRemarks) {
        this.userRemarks = userRemarks;
    }

    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public void setTypeOfInsurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }

}
