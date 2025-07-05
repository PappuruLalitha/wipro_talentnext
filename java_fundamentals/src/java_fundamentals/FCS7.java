package java_fundamentals;
import java.util.Scanner;
public class FCS7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a character: ");
    char ch=sc.next().charAt(0);
    if(Character.isLowerCase(ch)) {
    	ch=Character.toUpperCase(ch);
    }else {
    	ch=Character.toLowerCase(ch);
    }
    System.out.println(ch);
	}

}
