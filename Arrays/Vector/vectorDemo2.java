package Vector;
import java.util.Vector;

public class vectorDemo2 {
    public static void main(String[] args) {
        // when we manually provide the Capacity it initiliz the value in 0
        Vector v1 = new Vector<>(20);

        System.out.println("starting size of vector: " + v1.size());
        System.out.println("starting Capacity of vector: " + v1.capacity());

        v1.forEach(System.out::println);

    }

}
