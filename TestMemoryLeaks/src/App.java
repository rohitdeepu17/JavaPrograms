import java.util.ArrayList;
import java.util.List;

public class App {
    //Try with static list : won't be garbage collected as it's associated with class and not object. Will be garbage collected at the end of the program.
    public static List<Double> list = new ArrayList<>();

    //Try with non-static list
    //public List<Double> list = new ArrayList<>();

    public void populateList(){
        for(int i=0;i<10000000;i++){
            list.add(Math.random());
        }
        System.out.println("Debug point 2");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Debug point 1");
        new App().populateList();
        //Perform GC at Debug point 3
        System.out.println("Debug point 3");
    }
}
