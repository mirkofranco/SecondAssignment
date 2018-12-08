package it.unipd.tos;
import it.unipd.tos.model.MenuItem;
import junit.framework.TestCase;



public class MenuItemTest extends TestCase{

    @org.junit.Test
    public void testGetType(){
        MenuItem item = new MenuItem(MenuItem.itemType.PIZZA, "Margherita", 7.50);
        assertTrue(item.getType() == MenuItem.itemType.PIZZA);
    }

    @org.junit.Test
    public void testGetName(){
        MenuItem item = new MenuItem(MenuItem.itemType.PIZZA, "Capricciosa", 7.50);
        assertTrue(item.getName() == "Capricciosa");
    }

    @org.junit.Test
    public void testGetPrice(){
        MenuItem item = new MenuItem(MenuItem.itemType.PRIMI, "Tagliolini", 12.50);
        assertTrue(item.getPrice() == 12.50);
    }
}
