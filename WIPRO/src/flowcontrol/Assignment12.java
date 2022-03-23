package flowcontrol;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc =new Scanner (System.in);
        
        for(int j=10;j<99;j++)
        {
        int n=j;
        int ctrl=0;
        for(int i=2;i<n/2;i++)
        {
        	if(n%i==0)
        		ctrl++;
        }
        if(ctrl==0)
        	System.out.println(n);
       
           
	}}

}
