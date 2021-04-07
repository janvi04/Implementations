import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("Ram");
        list.add("Ramesh");
        list.add("Suresh");
        list.add("Disha");
        list.add("Janvi");
        list.forEach(
                // lambda expression
                (names)->
                {
                    System.out.println("hello " +names);

                }

        );
        System.out.println();
        list.forEach(
                (names)->{if(names.length()%2==0) System.out.println(names);}
        );
    }
}
