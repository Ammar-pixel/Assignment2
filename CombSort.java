import java.io.*;
import java.io.File; 
import java.util.Scanner; 

public class CombSort { 
	// To find gap between elements 
    int getNextGap(int gap) 
    { 
        // Shrink gap by Shrink factor 
        gap = (gap*10)/13; 
        if (gap < 1) 
            return 1; 
        return gap; 
    } 
  
    // Function to sort arr[] using Comb Sort 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // initialize gap 
        int gap = n; 
  
        // Initialize swapped as true to make sure that 
        // loop runs 
        boolean swapped = true; 
  
        // Keep running while gap is more than 1 and last 
        // iteration caused a swap 
        while (gap != 1 || swapped == true) 
        { 
            // Find next gap 
            gap = getNextGap(gap); 
  
            // Initialize swapped as false so that we can 
            // check if swap happened or not 
            swapped = false; 
  
            // Compare all elements with current gap 
            for (int i=0; i<n-gap; i++) 
            { 
                if (arr[i] > arr[i+gap]) 
                { 
                    // Swap arr[i] and arr[i+gap] 
                    int temp = arr[i]; 
                    arr[i] = arr[i+gap]; 
                    arr[i+gap] = temp; 
  
                    // Set swapped 
                    swapped = true; 
                } 
            } 
        } 
    }	    
	    static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	  
	        System.out.println(); 
	    } 

	public static void main(String[] args) throws IOException{
		File file = new File("D:\\KHAIRI\\2-Sem 3\\5- Data Structure\\Assignment 2\\combsort.txt"); 
    	Scanner sc = new Scanner(file); 
    	long startTime = System.nanoTime();
    	String numString;
    	int num,count=0;
		
        CombSort ob = new CombSort(); 
        int arr[] = new int[99]; 
        
        System.out.println("Data before sort: ");
        while (sc.hasNextLine()) {
    		numString=sc.nextLine();
    		num=Integer.parseInt(numString);
    		
    		arr[count]=num;
    		  		
    		System.out.print(arr[count]+" ");
    		count++;
    	}   
        ob.sort(arr); 
        System.out.println("\nData after sort:"); 
        printArray(arr); 
        long endTime = System.nanoTime();
    	System.out.println("Took "+(endTime - startTime) + " ns");
    } 
} 

