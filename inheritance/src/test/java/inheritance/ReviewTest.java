package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testConstructor () {
        Review test = new Review("great food","chandler",5);

        assertEquals("Review {body='great food', " +
                "author='chandler', " +
                "starRating=5}",
                test.toString());
    }
}
