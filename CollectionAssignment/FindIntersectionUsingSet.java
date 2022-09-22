package CollectionAssignment;



import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersectionUsingSet {
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
public static void main(String[] args) {
	Integer[] arr = {3,2,11,4,6,7};
	Integer[] arr1 = {1,2,8,4,9,7}; 
	Set<Integer> arr3 = new TreeSet<Integer>(Arrays.asList(arr));
	Set<Integer> arr4 = new TreeSet<Integer>(Arrays.asList(arr1));
	arr3.retainAll(arr4);
	System.out.println(arr3);
	//System.out.println(arr4);
for(int i = 0;i <= arr3.size()-1;i++) {
		
		for(int j = 0;j <= arr4.size()-1;j++) {
		
			if(arr3==arr4)
			{
				System.out.println(arr3);
		    
			}
			
			
	//System.out.println(arr3.equals(arr4));
			
		}
		
		
	
}}}

	
