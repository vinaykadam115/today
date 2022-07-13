package logicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		//This is modification line
		
		Scanner sc=new Scanner(System.in);    System.out.println("please enter number");
		int a = sc.nextInt();
		
//		int a=400055;
		String b = Integer.toString(a);
		
		int zeroes = 0 ;
		for(int i=0;i<=b.length()-1;i++)
		{
		   if (b.charAt(i)=='0')
		   {
			   zeroes++;
		   }
		
		}
			System.out.print("Number of zeroes in giver number: "+zeroes);
			
			System.out.println("Kunal Make Some Changes 13/7/2022");
		
		
	
		
		
		
		//Hello Mera Update Nhi ho rha hai
			
		
		
		
		
//		String a= "GiT";
//		String b="";
//		for(int i=a.length()-1;i>=0;i--)//T
//		{
//			b=b+a.charAt(i);
//		}
//		System.out.println(b+" is reversed string");
	
//		int a=20004;
//		String b = Integer.toString(a);
//		String finalb = "";
//		    for(int i=b.length()-1;i>=0;i--)
//		    {
//		    	finalb=finalb+b.charAt(i);
//		    }
//		int finala = Integer.parseInt(finalb);    
//		    
//		   System.out.println(finala); 
		    
	}

}
