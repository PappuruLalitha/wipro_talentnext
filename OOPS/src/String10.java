import java.util.Scanner;
public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String: ");
   String str=sc.nextLine();
   int n=str.length();
   if(n>3) {
	   String lastThree=str.substring(2,5);
	   StringBuffer result=new StringBuffer();
	   for(int i=0;i<3;i++) {
		   result.append(lastThree);
	   }
	   System.out.println("Output: "+result.toString());
   }
   }

}
