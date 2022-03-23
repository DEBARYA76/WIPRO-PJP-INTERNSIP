package arrays;

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			 int arr[][]=new int[3][3];
			 int k=0;
			 for(int i=0;i<3;i++)
			 for(int j=0;j<3;j++)
			 arr[i][j]=Integer.parseInt(args[k++]);
			 int largest=Integer.MIN_VALUE;
			 for(int i=0;i<3;i++)
			 for(int j=0;j<3;j++)
			 if(arr[i][j]>largest) largest=arr[i][j];
			 
			 System.out.println("biggest number in array is "+largest);
			 
	}

}
