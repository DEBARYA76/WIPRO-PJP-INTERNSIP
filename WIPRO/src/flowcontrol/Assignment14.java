package flowcontrol;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc =new Scanner (System.in);
        int number=sc.nextInt();
        
        
        int sum = 0;
		
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		
		System.out.println(sum);

	}

}
