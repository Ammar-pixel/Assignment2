import java.io.*;
import java.io.File; 
import java.util.Scanner; 
public class InsertionSort {
	 /*Function to sort array using insertion sort*/
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    } 
  
    /* A utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    public static void main(String args[])throws IOException 
    {         
    	File file = new File("D:\\KHAIRI\\2-Sem 3\\5- Data Structure\\Assignment 2\\combsort.txt"); 
    	Scanner sc = new Scanner(file); 
    	long startTime = System.nanoTime();
   	
    	String numString;
    	int num,count=0;
    	int arr[]=new int[99];
    	
    	System.out.println("Data before sort: ");
    	while (sc.hasNextLine()) {
    		numString=sc.nextLine();
    		num=Integer.parseInt(numString);
    		
    		arr[count]=num;
    		  		
    		System.out.print(arr[count]+" ");
    		count++;
    	}    		   
    	System.out.println();
        InsertionSort ob = new InsertionSort();         
        ob.sort(arr); 
        System.out.println("\nData after sort:");  
        printArray(arr); 
        long endTime = System.nanoTime();
        System.out.println();
    	System.out.println("The time taken to sort all the data is "+(endTime - startTime) + " nanoseconds"); 
    } 
}

