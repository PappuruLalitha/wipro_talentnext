import java.util.Scanner;
public class String4 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String: ");
    String str=sc.nextLine();
    int n=str.length();
    if(n%2==0) {
    	String firstHalf=str.substring(0,n/2);
    	System.out.println("output:" +firstHalf);
    }else {
    	System.out.println("null");
    }
	}
}
