import java.util.Scanner;
public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String: ");
   String str=sc.nextLine();
   if(str.length()==0) {
	   System.out.println(str);
   }else {
	   if(str.startsWith("x")) {
		   str=str.substring(1);
	   }if(str.endsWith("x")){
		   str=str.substring(0,str.length()-1);
	   }
	   System.out.println(str);
   }
	}
}

