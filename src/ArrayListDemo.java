import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());

        // Add elements to the ArrayList
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add("A2");
        System.out.println("Size of al after additions: " + al.size());

        // Display the ArrayList
        System.out.println("Contents of al: " + al);

        // Remove elements from the ArrayList
        al.remove(5);
        al.remove("G");
        al.remove(2);

        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }
}

