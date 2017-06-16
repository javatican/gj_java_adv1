
import java.util.ArrayList;

public class TestErrors {

    public static void main(String args[]) {

        ArrayList theList = new ArrayList();
        while (true) {

            String theString = "A test String";

            theList.add(theString);

            if (theList.size() % 1000000 == 0) {
                System.out.println("List now has " + theList.size() / 100000 + " million elements!");
            }
        }
    }
}
