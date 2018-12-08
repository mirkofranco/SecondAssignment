////////////////////////////////////////////////////////////////////
// [MIRKO] [FRANCO] [1138070]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;


import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;
import java.util.List;

public class BillMaker implements RestaurantBill {


    public double getOrderPrice(List<MenuItem> itemsOrdered)
            throws RestaurantBillException{
        if(itemsOrdered.size() > 20) {
            throw new RestaurantBillException("Numero di ordinazioni" +
                    " maggiori di 20");
        }
        return 0;
    }
}
