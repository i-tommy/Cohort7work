package africa.semicolon.customer;

import africa.semicolon.customer.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    public String customerID;

    @Test
    public void testThatCustomerIsAvailable() {
        Customer customer = new Customer();
        customer.getCustomerID();
        customer.setCustomerID("bisi");
        assertEquals("bisi", customer.getCustomerID());

    }

    public String customerAddress;

    @Test
    public void testTheCustomerHasAddress() {
        Customer customer = new Customer();
        customer.getCustomerAddress();
        customer.setCustomerAddress("IlupejuStreet");
        assertEquals("IlupejuStreet", customer.getCustomerAddress());

    }
    @Test
    public void testTheCustomerHasPhoneNumber() {
        Customer customer = new Customer();
        customer.getCustomerPhoneNumber();
        customer.setCustomerPhoneNumber("08164290656");
        assertEquals("08164290656", customer.getCustomerPhoneNumber());
    }
    @Test
    public void testThatCustomerHasEmail() {
        Customer customer = new Customer();
        customer.getCustomerEmail();
        customer.setCustomerEmail("zick.tommy@Email.com");
        assertEquals("zick.tommy@Email.com", customer.getCustomerEmail());




    }

}
