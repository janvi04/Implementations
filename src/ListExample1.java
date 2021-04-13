import java.util.ArrayList;  //importing ArrayList
import java.util.List;      //importing List

public class ListExample1 {   //declaration of the class

    public static void main(String[] args) {  //main method
        List<String> list=new ArrayList<String>();   //creating the list
        list.add("Ram");         //adding element to the list
        list.add("Ramesh");      //adding element to the list
        list.add("Suresh");      //adding element to the list
        list.add("Janvi");       //adding element to the list
        System.out.println(list.contains("Janvi"));  //checking if the list contains this object or not
        list.remove(0);  //removing the object at index 0
        list.remove("Janvi");   //removing the object
        System.out.println(list.contains("Janvi"));  //checking if the list contains this object or not
        list.forEach(
                // using lambda expressions to iterate through the list
                (names)->
                {
                    System.out.println("hello " +names);   //printing hello with the names
                }
        );
    }  //end of main method
}  //end of class
