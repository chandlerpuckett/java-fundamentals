package inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Theater extends Business{

    ArrayList<String> currentlyShowing = new ArrayList<>();

    public Theater(String name, String description, String cost) {
        super(name, description, cost);
    }

//    ----- functions -----


    public void addMovie (String movieToAdd){           // adds movie to list of currently showing
        currentlyShowing.add(movieToAdd);
    }

    public void removeMovie (String movieToRemove){     // removes movie from list
        if (currentlyShowing.size() == 0){return;}
        currentlyShowing.removeIf(movie -> movie.equals(movieToRemove));
    }

    @Override
    public String toString() {
        return "Theater {" +
                "currentlyShowing=" + currentlyShowing +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost='" + cost + '\'' +
                ", rating=" + rating +
                ", reviewList=" + reviewList +
                '}';
    }
}
