package arrays;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=Integer.parseInt(args[0]);
		 int n2=Integer.parseInt(args[1]);
		 int n3=Integer.parseInt(args[2]);
		 int n4=Integer.parseInt(args[3]);
		 System.out.println("given array is");
		 System.out.println(n1+" "+n2);
		 System.out.println(n3+" "+n4);
		 int temp;
		 temp=n1;
		 n1=n4;
		 n4=temp;
		 temp=n2;
		 n2=n3;
		 n3=temp;
		 System.out.println("reversed array is");
		 System.out.println(n1+" "+n2);
		 System.out.println(n3+" "+n4);

	}

}
