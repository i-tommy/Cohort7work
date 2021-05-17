package africa.semicolon.ecommerce.Payment;

import africa.semicolon.customer.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class PaymentTest {

        public String paymentID;
        private String monday12;
        private String FifteenThousandNaira;

        @Test
        public void testThatCustomerIdIsAvailable() {
            Payment payment = new Payment();
            payment.getPaymentID();
            payment.setPaymentID("esther");
            assertEquals("esther", payment.getPaymentID());

        }


        @Test
        public void testThatCustomerHasDate() {
            Payment payment = new Payment();
            payment.getPaymentDate();
            payment.setPaymentDate("monday12");
            assertEquals("monday12", payment.getPaymentDate());

        }

        @Test
        public void testTheCustomerDetailsIsAvailable() {
            Payment payment = new Payment();
            payment.getPaymentDetails();
            payment.setPaymentDetails("estherCompany");
            assertEquals("estherCompany", payment.getPaymentDetails());

        }
        @Test
        public void testThatCustomerTotalIsAvailable() {
            Payment payment = new Payment();
            payment.getPaymentTotal();
            payment.setPaymentTotal("FifteenThousandNaira");
            assertEquals(FifteenThousandNaira, payment.getPaymentDetails());
        }
    }