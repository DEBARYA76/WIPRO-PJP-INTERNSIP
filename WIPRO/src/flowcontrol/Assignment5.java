package flowcontrol;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='+';
		 if((c>='a' && c<='z') || (c>='A' && c<='Z') )
		     System.out.println("Alphabet");
		 else if(Character.isDigit(c)) 
			 System.out.println("Number");
		 else
			 System.out.println("Special character");
	}

}
