package CollectionAssignment;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {
	public static void main(String[] args) {
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		Integer[] data = {3,2,11,4,6,7};
		
		ArrayList<Integer> data1 = new ArrayList<Integer>(Arrays.asList(data));
		System.out.println(data1);
	data1.size();
	System.out.println(data1.size());
	//Collections.sort(data1);
	//ArrayList<Integer> data2=new ArrayList<Integer>(data1);
	
	System.out.println("Second Element from the Last "+ data1.get(5));
	       
	}

}
