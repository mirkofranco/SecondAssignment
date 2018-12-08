package it.unipd.tos;
import it.unipd.tos.model.MenuItem;

import static org.junit.Assert.assertEquals;


public class MenuItemTest{

    @org.junit.Test
    public void testGetType(){
        MenuItem item = new MenuItem(MenuItem.itemType.PIZZA, "Margherita", 7.50);
        assertEquals(item.getType(), MenuItem.itemType.PIZZA);
    }

    @org.junit.Test
    public void testGetName(){
        MenuItem item = new MenuItem(MenuItem.itemType.PIZZA, "Capricciosa", 7.50);
        assertEquals(item.getName(),  "Capricciosa");
    }

    @org.junit.Test
    public void testGetPrice(){
        MenuItem item = new MenuItem(MenuItem.itemType.PRIMI, "Tagliolini", 12.50);
        assertEquals(item.getPrice(), 12.50, 1E-10);
    }
}
