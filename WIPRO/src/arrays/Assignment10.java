package arrays;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		int i,e=0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
				b[e++]=a[i];
		}
		for(i=0;i<n;i++)
		{
			if(a[i]%2!=0)
				b[e++]=a[i];
		}
		for(i=0;i<n;i++)
			System.out.print(b[i]+" ");
	}

}
