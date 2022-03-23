package arrays;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner s = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		int[] c = new int[2];
		for(i=0;i<3;i++)
			a[i]=s.nextInt();
		for(i=0;i<3;i++)
			b[i]=s.nextInt();
		c[0]=a[1];
		c[1]=b[1];
		for(i=0;i<2;i++)
			System.out.print(c[i]+" ");
		
	}

}
