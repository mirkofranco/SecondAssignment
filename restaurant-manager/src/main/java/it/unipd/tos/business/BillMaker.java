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
        double totalPrice = 0;
        totalPrice = itemsOrdered.stream().mapToDouble(x -> x.getPrice()).sum();
        if(itemsOrdered
                .stream()
                .filter(x -> x.getType() == MenuItem.itemType.PIZZA)
                .count() > 10 ) {
            totalPrice -= itemsOrdered
                    .stream()
                    .filter(x -> x.getType() == MenuItem.itemType.PIZZA)
                    .mapToDouble(x -> x.getPrice()).min().getAsDouble();
        }
        if(totalPrice > 100 ){
            totalPrice -= 0.05 * totalPrice ;
        }
        return totalPrice;
    }
}
