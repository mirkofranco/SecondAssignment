package it.unipd.tos;

import it.unipd.tos.business.exception.RestaurantBillException;
import junit.framework.TestCase;
public class RestaurantBillExceptionTest extends TestCase {

    @org.junit.Test
    public void testGetMessage(){
        RestaurantBillException exception = new RestaurantBillException("Test");
        assertTrue(exception.getMessage() == "Test");
    }
}
