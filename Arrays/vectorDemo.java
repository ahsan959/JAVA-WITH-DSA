import java.util.Vector;

public class vectorDemo {
    public static void main(String args[]) {
        Vector v = new Vector<>();
        System.out.print(v.size());
        System.out.println();
        System.out.print(v.capacity());

        v.add("a");
        v.add("a");
        v.add("a");
        v.add("a");
        v.add("a");
        v.add("a");
        v.add("a");
        v.add("a");
        v.add("a");
        v.add("a");
        v.add("v");

        // System.out.println();
        // System.out.print(v.size());
        // System.out.println();
        // System.out.print(v.capacity());

        // print vector
        v.forEach(System.out::println);
        
        

    }
}