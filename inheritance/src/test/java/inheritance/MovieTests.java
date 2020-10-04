package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTests {
    @Test
    public void addMovie(){
        Theater test = new Theater("Regal","10 films", "$");
        test.addMovie("Tenet");
        test.addMovie("Hocus Pocus");

        assertEquals("[Tenet, Hocus Pocus]",test.currentlyShowing.toString());
        test.addMovie("Sicario");
        assertEquals("[Tenet, Hocus Pocus, Sicario]",test.currentlyShowing.toString());
    }

    @Test
    public void removeMovie(){
        Theater test = new Theater("Regal","10 films", "$");
        test.addMovie("Tenet");
        test.addMovie("Hocus Pocus");
        test.addMovie("Sicario");

        test.removeMovie("Hocus Pocus");
        assertEquals("[Tenet, Sicario]",test.currentlyShowing.toString());

        test.removeMovie("Tenet");
        assertEquals("[Sicario]",test.currentlyShowing.toString());

        test.removeMovie("Sicario");
        assertEquals("[]",test.currentlyShowing.toString());
    }

}
