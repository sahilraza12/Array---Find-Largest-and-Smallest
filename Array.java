import java.util.*;

//Largest number in Array
public class Array {
    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE; //  -infinity 
        int Smallest = Integer.MAX_VALUE; // +infinity 
        for(int i=0; i<numbers.length; i++){
            if(Largest < numbers[i]){
                Largest = numbers[i];
        
            if(Smallest > numbers[i]){
                Smallest = numbers[i];
            }
        }
        }

        System.out.println("Smallest Value is : " +Smallest); 
        return Largest;
       
    }
    public static void main(String args[]){
     int numbers[] = {1, 2, 4, 6, 3, 2, 5};
     System.out.println("Largest Value is : " +getLargest(numbers));

    }
    
}
