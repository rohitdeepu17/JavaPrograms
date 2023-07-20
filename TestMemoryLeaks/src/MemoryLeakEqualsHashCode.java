import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MemoryLeakEqualsHashCode {

    public static void main(String[] args) throws Exception {
        System.out.println("Debug point 1");
        Map<Person, Integer> map = new HashMap<>();
        for(int i=0;i<1000000;i++){
            map.put(new Person("Rohit"), 1);
        }
        //Perform GC at Debug point 3
        System.out.println("Debug point 2");
    }
}

