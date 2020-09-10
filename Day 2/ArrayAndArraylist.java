import java.util.ArrayList; 
import java.util.Arrays; 
class ArrayAndArraylist 
{ 
    public static void main(String args[]) 
    { 
        /* ........... Normal Array............. */
        // Need to specify the size for array  
        int arr[] = new int[3]; 
        arr[0] = 1; 
        arr[1] = 2; 
        arr[2] = 3; 
        // We cannot add more elements to array arr[] 
  
        /*............ArrayList..............*/
        // Need not to specify size  
        ArrayList<Integer> arr1 = new ArrayList<Integer>(); 
        arr1.add(1); 
        arr1.add(2); 
        arr1.add(3); 
        arr1.add(4); 
        // We can add more elements to arrL 
  
        System.out.println(arr1); 
        System.out.println(Arrays.toString(arr)); 
    } 
} 