package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {

    @Test
    public void testRestaurantConstructor(){
        Restaurant test = new Restaurant("pizzatime", "$$$", 4.5);

        assertEquals("Restaurant " +
                "{name='pizzatime', " +
                "cost='$$$', " +
                "rating=4.5}", test.toString());
    }

//    @Test
//    public void testReviewConstructor (){
//        Review test = new Review("the pizza is awful", "SomeBody", 1.5);
//
//        assertEquals("Review " +
//                "{body='the pizza is awful', " +
//                "author='SomeBody', " +
//                "starRating=1.5}",test.toString());
//    }

}
