package it.unipd.tos;

import it.unipd.tos.business.BillMaker;
import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;



public class BillMakerTest {

    @org.junit.Test(expected = RestaurantBillException.class)
    public void testPriceException() throws RestaurantBillException{
        List<MenuItem> item = new ArrayList<>();
        for(int i = 0; i < 21; i++) {
            item.add(new MenuItem(MenuItem.itemType.PIZZA, "Margherita", 4.50));
        }
        BillMaker maker = new BillMaker();
        maker.getOrderPrice(item);
    }

   @org.junit.Test
    public void testDieciPizze(){
        List<MenuItem> item = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            item.add(new MenuItem(MenuItem.itemType.PIZZA, "Margherita", 10));
        }
        item.add(new MenuItem(MenuItem.itemType.PIZZA, "Capricciosa", 9));
        BillMaker maker = new BillMaker();
        double totalPrice = 0;
        try {
            totalPrice = maker.getOrderPrice(item);
        }catch(RestaurantBillException e){
            System.out.println("Errore");
        }
        assertEquals(totalPrice, 100, 1E-100);
    }

   @org.junit.Test
    public void testSconto(){
        List<MenuItem> item = new ArrayList<>();
        for(int i = 0; i < 11; i++){
            item.add(new MenuItem(MenuItem.itemType.PRIMI, "Tagliolini", 10));
        }
        BillMaker maker = new BillMaker();
        double totalPrice = 0;
        try {
            totalPrice = maker.getOrderPrice(item);
        }catch(RestaurantBillException e){
            System.out.println("Errore");
        }
        assertEquals(totalPrice, 104.5, 1E-100);
    }

    @org.junit.Test
    public void testCompleto(){
        List<MenuItem> item = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            item.add(new MenuItem(MenuItem.itemType.PIZZA, "Margherita", 20));
        }
        item.add(new MenuItem(MenuItem.itemType.PIZZA, "Capricciosa", 9));
        BillMaker maker = new BillMaker();
        double totalPrice = 0;
        try {
            totalPrice = maker.getOrderPrice(item);
        }catch(RestaurantBillException e){
            System.out.println("Errore");
        }
        assertEquals(totalPrice, 190, 1E-100);
    }
}
