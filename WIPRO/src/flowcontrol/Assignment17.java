package flowcontrol;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		
		 int number=0;
		 int temp=n;
		 while(n>0)
		 {
		 int t=n%10;
		 number=number*10+t;
		 n/=10;
		 }
		 if(temp==number) 
			 System.out.println("palindrome");
		 else 
			 System.out.println("not palindrome");
		 }}
