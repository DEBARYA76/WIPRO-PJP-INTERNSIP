package flowcontrol;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		
		
		
		Scanner sc =new Scanner (System.in);
        int age=sc.nextInt();
        String s1=sc.next();
		if(s1.equals("female") && age>=1 && age<=58) 
			    System.out.println("poi is 8.2%");
		if(s1.equals("female") && age>=59 && age<=100)
				System.out.println("poi is 9.2%");
		 if(s1.equals("male") && age>=1 && age<=58) 
			    System.out.println("poi is 8.4%");
		if(s1.equals("male") && age>=59 && age<=100)
				System.out.println("poi is 10.5%");

	}

}
