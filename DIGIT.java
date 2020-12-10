// Java program to compute  
// sum of digits in number. 
import java.io.*; 
import java.util.Scanner;
  
class DIGIT { 
      
    /* Function to get sum of digits */
    static int getSum(int n) 
    {     
        int sum = 0; 
          
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
      
    return sum; 
    } 
  
   
    public static void main(String[] args) 
    { 
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		int k = sc.nextInt();
		int[] a = new int[30];
		System.out.println(" ");
		for (int i = 0; i<k;i++)
		{
			 a[i] = sc.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			 int n = a[i];
			 System.out.print(" "+getSum(n)); 
		}
        
  
        
    } 
} 
  