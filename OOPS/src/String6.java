import java.util.Scanner;
public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Strings: ");
   String a=sc.nextLine();
   String b=sc.nextLine();
   if(a.length() < b.length()) {
	  System.out.println(a+b+a);
   }else {
	   System.out.println(b+a+b);
   }
	}

}
