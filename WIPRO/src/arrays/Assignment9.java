package arrays;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,c=0;
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]!=10)
				b[c++]=a[i];
		}
		for(i=0;i<n;i++)
			System.out.print(b[i]+" ");

	}

	}


