import java.util.HashSet;
import java.util.Set;  //import statements
public class SetExample {  //declaration of the class

    public static void main(String[] args) {  // main method

        Set<Integer> numbers = new HashSet<Integer>();  //creating the set

        numbers.add(25);   //adding elements to the set
        numbers.add(89);   //adding elements to the set
        numbers.add(4);   //adding elements to the set
        numbers.add(23);  //adding elements to the set
        numbers.add(2);    //adding elements to the set
        numbers.remove(2);    //removing element from the set
        numbers.forEach(
                //using lambda expression to iterate through the set
                (num)->
                {
                    System.out.println(num);  //printing the elements in set
                    if(num%2==0) System.out.println(num + " is an even number");  //checking if the number is even or not
                }
        );
        System.out.println("The size of the set is "+numbers.size());   //printing the size of the set
        System.out.println(numbers.contains(4));  //checking if the set contains this elemsnt or not.
    }    //end of main method
}        //end of class
