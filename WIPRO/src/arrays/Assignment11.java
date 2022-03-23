package arrays;

import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,c=0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			if((a[i]!=1) && (a[i]!=4)) 
			{
				c=1;
			}
		}
		if(c==1)
			System.out.print("false");
		else
			System.out.print("true");
	}

}
