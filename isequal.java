package isequallll;

import java.util.Arrays;

public class isequal {
	public static void main(String[] args) 
	  {
		//i created 3 diffirent arrays array 1,2 and 3
		int arr_1[] ={1, 5, 7, 9};
		int arr_2[] = {9, 5, 1, 7};
		int arr_3[] = {1, 6, 7, 5};
	    // array . sort sorts every array from low to high
	    Arrays.sort(arr_1);
	    Arrays.sort(arr_2);
	    Arrays.sort(arr_3);
	    // arrays.equal is a built in function in 
	    //java.util.Arrays that checks if every value in array 1 is equal to array 2 
	    // and boolean will return true or false
	    boolean returnVal1 = Arrays.equals(arr_1,arr_2);
	    
	    int x=arr_1.length;
	    System.out.println("array 1 is : " );
	    //this for loop is to print the arrays to show the user the outputs
	    for (int i=0; i<x; i++)  
	        System.out.println(arr_1[i]+"    "); 
	    int m=arr_1.length;
	    System.out.println("array 2 is : " );
	    
	    for (int i=0; i<m; i++)  
	        System.out.println(arr_2[i]+"    ");
	    System.out.println("Array 1 and 2 equal?: " + returnVal1);
	    

	    boolean returnVal2 = Arrays.equals(arr_2,arr_3);
	    System.out.println("Array 2 and 3 equal?: " + returnVal2);
	  }

}
