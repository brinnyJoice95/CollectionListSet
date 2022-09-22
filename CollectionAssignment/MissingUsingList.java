package CollectionAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingUsingList {
	public static void main(String[] args) {
		
	Integer[] arr = {1,2,3,4,7,6,8};
	ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(arr));
	
		for(int i = 0;i < arr1.size();i++) {
			if(arr[i]+1 != arr[i+1])
			{
				System.out.println(arr[i]+1);
			break;
		         
		
			}
	
		}}}


