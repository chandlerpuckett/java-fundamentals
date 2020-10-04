package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void testShopConstructor(){
        Shop testShop = new Shop("blockbuster","rentals","$");
        assertEquals("Shop " +
                "{name='blockbuster', " +
                "description='rentals', " +
                "cost='$'}", testShop.toString());
    }
}
