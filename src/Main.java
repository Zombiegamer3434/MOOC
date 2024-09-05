import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Bird, String> birdFinder = new HashMap<>();
        Bird flemingo = new Bird("flemingo", "flemingus");
        System.out.println(birdFinder.get(new Bird("flemingo", "flemingus")));
    }
}
