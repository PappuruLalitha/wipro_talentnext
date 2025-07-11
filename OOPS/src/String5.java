import java.util.Scanner;
public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String: ");
    String str=sc.nextLine();
    int n=str.length();
    if(n <= 2) {
    	System.out.println("Result: ");
    }else {
    	String result=str.substring(1,n-1);
    	System.out.println(result);
    }
	}

}
