import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    // If the list is being modified by multiple threads (or requires modifications during iteration),
    // you can use a CopyOnWriteArrayList. This class is designed to handle concurrent modifications
    // without throwing ConcurrentModificationException because it creates a copy of the list on each modification.
    
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String s : list) {
            if (s.equals("B")) {
                list.remove(s); // No ConcurrentModificationException
            }
        }
        System.out.println(list); // Output: [A, C]
    }
}
