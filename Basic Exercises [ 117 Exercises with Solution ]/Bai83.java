package Thuong17IT2;

import java.util.Arrays;

public class Bai83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "";
		   int[] left_array = {1, 3, -5, 4};
		   int[] right_array = {1, 4, -5, -2};
		   System.out.println("\nArray1: "+Arrays.toString(left_array));  
		   System.out.println("\nArray2: "+Arrays.toString(right_array)); 
	       for (int i = 0; i < left_array.length; i++) {
					int num1 = left_array[i];
					int num2 = right_array[i];
					result += Integer.toString(num1 * num2) + " "; 
				}
			System.out.println("\nResult: "+result);     

	}

}