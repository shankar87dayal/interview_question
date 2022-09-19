package com.interview.question.book;

public class FibonacciSeries {
//	 static int fibonacci(int x)
//	    {
//		 int i;
//	    int f[] = new int[x+2]; 
//	    
//	      
//	    f[0] = 0;
//	    f[1] = 1;
//	     
//	    for (i = 2; i <= x; i++)
//	    {
//	       
//	        f[i] = f[i-1] + f[i-2];
//	    }
//	      
//	    return f[x];
//	    }
	
	static int fabonaccis(int x)
	{
		if(x<1)
			return x;
		else
			return fabonaccis(x-1)+fabonaccis(x-2);
	}
	 public static void main(String[] args) {
		 
//		 int x = 11;
//	        System.out.println(fibonacci(x));
		 int ip=7;
		 for (int i = 0; i < ip; i++) 
//			 System.out.println(fibonacci (i) + " ");
			 System.out.println(fabonaccis (i) + " ");
		
	}

}
