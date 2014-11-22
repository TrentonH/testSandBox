package sand;

import java.util.Scanner;

public class HelloWorld 
{
 public static void main(String[] args)
 {
	System.out.print("hello world"); 
	
	if (5>4)
	{
		System.out.println("   hello you sexy thing");
	}
	
	for(int i = 10; i>0; i--)
	{
		System.out.println(i);
	}
	
	String bang = BadBoy();
	System.out.println(bang);
	
	System.out.println("enter your age you old fart!");
	
	Scanner downTheStream = new Scanner(System.in);
	float yourBoat=downTheStream.nextFloat();
	downTheStream.close();
	
	System.out.println("wow " + yourBoat  + " is old!");
	}
 
 
 public static String BadBoy()
 {
	 String bang = "bang!";
	 return bang;
 }
 }
 

