package flowcontrol;

import java.util.Scanner;

public class Assignment1b {

	public static void main(String[] args) {
		 Scanner sc =new Scanner (System.in);
	        int n1=sc.nextInt();
	       
	        int n2=sc.nextInt();
	        if(n1>0 && n2>0)
	        {
	        	if(n1%10 == n2%10)
	        		System.out.println("true");
	        	else
	        		System.out.println("false");
	        }

	}

}
