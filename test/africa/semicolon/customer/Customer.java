package africa.semicolon.customer;

public class Customer<CustomerAddress> {
    public String CustomerID;
    public String CustomerAddress;
    private String IlupejuStreet;
    private String CustomerPhoneNumber;
    private String phoneNumber;
    private String CustomerEmail;

    public String getCustomerID() { return CustomerID;}

    public void setCustomerID(String bisi) { this.CustomerID =bisi; }

    public String getCustomerAddress() { return CustomerAddress;}

    public void setCustomerAddress(String ilupejuStreet) { this.CustomerAddress =ilupejuStreet; }


    public String getCustomerPhoneNumber() {
        return phoneNumber;
    }
    public void setCustomerPhoneNumber(String phoneNumber) {this.phoneNumber= phoneNumber; }


    public String getCustomerEmail() { return CustomerEmail; }


    public void setCustomerEmail(String customerEmail) {this.CustomerEmail= customerEmail; }

}





