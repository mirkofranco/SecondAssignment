////////////////////////////////////////////////////////////////////
// [MIRKO] [FRANCO] [1138070]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

public class RestaurantBillException extends Exception {

    public RestaurantBillException(String message){
        super(message);
    }

    public String getMessage(){
        return super.getMessage();
    }
}
