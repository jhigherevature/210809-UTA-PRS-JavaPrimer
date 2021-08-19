package comparisons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * The Arrays class (note that this is a class in Java, NOT 
 * specifically an Array Object), is a utility class in the
 * JRE that provides functionality that can be used with Array
 * Objects. This allows you to print Array objects to the console
 * instead of printing just hashcode (Arrays.toString(array)), or
 * being able to sort arrays (Arrays.sort(array));
 */
public class Simulator {
	public static void main(String[] args) {
		Data d1 = new Data(1, 6.7);
		Data d2 = new Data(7, 99.3);
		Data d3 = new Data(101, 45.1);
		Data d4 = new Data(34, 18.2);
		Data d5 = new Data(66, 2.1);
		
		Data[] datas = {d1, d2, d3, d4, d5};
		System.out.println("INITIAL ARRAY:");
		System.out.println(Arrays.toString(datas));
		Arrays.sort(datas);
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(datas));
		
		ArrayList<Data> dList = new ArrayList<Data>();
		dList.add(d1);
		dList.add(d2);
		dList.add(d3);
		dList.add(d4);
		dList.add(d5);
		System.out.println("INITIAL ARRAY LIST:");
		System.out.println(dList);
		Collections.sort(dList, new IdComparator());
		System.out.println("SORTED BY ID");
		System.out.println(dList);
		System.out.println("SORTED BY AMOUNT");
		Collections.sort(dList, new AmountComparator());
		System.out.println(dList);
		
		String[] words = {"banana", "apple", "carrot", "Apple", "Ax", "baa"};
		/*
		 * iterate through each word, and determine which
		 * letter comes first (char by char)
		 */
		System.out.println(Arrays.toString(words));
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
		System.out.println((byte)'A');
		System.out.println((byte)'a');
		
		String[] nums = {"1", "2", "4", "9", "10", "22", "18"};
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
	}
}
