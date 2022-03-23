package flowcontrol;
import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        if(n<0)
        	System.out.println("negative");
        else if(n==0)
        	System.out.println("zero");
        else
        	System.out.println("positive");
	}

}
