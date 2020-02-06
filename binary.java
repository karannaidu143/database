import java.io.*; 
import java.util.*;
  
class binary
{ 
  
    public static int first(int arr[], int low, int high, int x, int n) 
    { 
        if(high >= low) 
        { 
            int mid = low + (high - low)/2; 
            if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x) 
                return mid; 
             else if(x > arr[mid]) 
                return first(arr, (mid + 1), high, x, n); 
            else
                return first(arr, low, (mid -1), x, n); 
        } 
    return -1; 
    } 
   
  
    public static int last(int arr[], int low, int high, int x, int n) 
    { 
        if (high >= low) 
        { 
            int mid = low + (high - low)/2; 
            if (( mid == n-1 || x < arr[mid+1]) && arr[mid] == x) 
                 return mid; 
            else if (x < arr[mid]) 
                return last(arr, low, (mid -1), x, n); 
            else
                return last(arr, (mid + 1), high, x, n); 
        } 
    return -1; 
    } 
      
    public static void main (String[] args) 
    { 
          Scanner sc=new Scanner(System.in);
          
         int arr[] = new int [10];
         System.out.println("enter n values");
         int n=sc.nextInt();
          System.out.println("enter array values");
        for(int i=0;i<n ;i++ ){
        arr[i]=sc.nextInt();
        }
            System.out.println("enter key element");
         int x=sc.nextInt();


        System.out.println("First Occurrence = " + first(arr, 0, n-1, x, n)); 
        System.out.println("Last Occurrence = " + last(arr, 0, n-1, x, n)); 
  
    } 
} 
