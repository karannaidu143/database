import java.util.*;
 
  class binarySearch{
    int t,no,no1,search;
    int n[]=new int [50];
           Scanner sc=new Scanner (System.in);
  void input(){
     

     
      System.out.println("enter the number of test cases");
     
      t=sc.nextInt();
      
      System.out.println("enter the number of elements");
       
        no=sc.nextInt();
          
      System.out.println("enter the search element");
       
        search=sc.nextInt();
        System.out.println("enter the  array of elements ");
        no1=no;
      int  i=0;
while(no1!=0)
       {
       n[i]=sc.nextInt();
       i++;
       }
       
       }

       
int process(){

      int start=0,mid; 
          mid=(start+no)/2;
      while( start<=no)
      {
   if(n[mid]<search)
     
     { start=mid+1;
      }
     else if(n[mid]==search)
     
     {
          System.out.println("element found");
   return 0 ;
          }
   
      else
      no=mid-1;
      
      }
      if(no>start)  {
    System.out.println("element notfound");
    return 0;
      
      }
      return 0;
     
     }

     
    }
    class demo{

    public static void main(String args[]){
    binarySearch b=new binarySearch();
    b.input();
    b.process();
}
}


  
