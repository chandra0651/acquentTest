import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PizzaUnitTest {

    @Test
    public void testCurrentDate() {
        Pizza p = new Pizza();
        Long epoch = 1477405487L;
        String currentDate = p.currentDate(epoch);
        Assert.assertEquals("25/10/2016 09:24:47", currentDate);
    }

    @Test(expected = NullPointerException.class)
    public void testCurrentDate_NullPointerException() {
        Pizza p = new Pizza();
        p.currentDate(null);
    }

    @Test
    public void testLexicographicalOrder() throws IOException{
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Pizza", "anyTime"));
        orders.add(new Order("Bread", "anyTime"));
        Pizza pizza = new Pizza();
        pizza.lexicographicalOrder(orders);
        Assert.assertEquals("Bread", orders.get(0).getName());
    }

    @Test(expected = FileNotFoundException.class)
    public void testreadOut_FileNotFound() throws IOException {
        Pizza pizza = new Pizza();
        pizza.readInput("/") ;
    }

    @Test(expected = FileNotFoundException.class)
    public void testOut_FileNotFoundException() throws IOException {
        Pizza pizza = new Pizza();
        pizza.outPutFile("/", new ArrayList<>()); ;
    }

    @Test(expected = FileNotFoundException.class)
    public void testreadOut_FileNotFound1() throws IOException {
        Pizza pizza = new Pizza();
        pizza.outPutFile("/", new ArrayList<>()); ;
    }
}

