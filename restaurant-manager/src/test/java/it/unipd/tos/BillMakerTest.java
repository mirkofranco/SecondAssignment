package it.unipd.tos;

import it.unipd.tos.business.BillMaker;
import it.unipd.tos.business.RestaurantBill;
import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;
import java.util.List;
import java.util.ArrayList;



public class BillMakerTest {

    @org.junit.Test(expected = RestaurantBillException.class)
    public void testPriceException() throws RestaurantBillException{
        List<MenuItem> item = new ArrayList<>();
        for(int i = 0; i < 21; i++)
            item.add(new MenuItem(MenuItem.itemType.PIZZA, "Margherita", 4.50));
        BillMaker maker = new BillMaker();
        maker.getOrderPrice(item);

    }


}
