import java.util.*;

class Cal{
    
     int n,m ;
 
 	int process(int n,int 	m){
 	 if (m==0){
 	 return n;}
 return process(m,n%m);
 
 	 
 	}
 	}
 	
 	class gcd {
 	public static void main(String args[]){
 	 	     int n,m ,gcd;
 	 	     System.out.println("enter value for n amd m");
 	 	     
 	 	Scanner sc =new Scanner (System.in);
 	n= sc.nextInt();
 	m=sc.nextInt();
  	  Cal c = new Cal();
  	  
  	   	 	     System.out.println( c.process(n,m));
  	   	 	     }
  	   	 	     }
