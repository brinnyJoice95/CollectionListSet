package CollectionAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatInCollection {
	public static void main(String[] args) {
		
	
	Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	Set<Integer> dup = new TreeSet<Integer>(Arrays.asList(arr));
	System.out.println(dup);
}
}