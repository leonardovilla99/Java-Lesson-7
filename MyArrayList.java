/**
 * MyArrayList
 */
import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println("Array list size: " + names.size());

        names.add("Carlos");
        names.add("Mary");
        names.add("Brian");
        System.out.println("Array list size: " + names.size());
    }
}