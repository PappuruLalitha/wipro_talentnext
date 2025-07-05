package java_fundamentals;
import java.util.Scanner;
public class flow_control_statement1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a%10==b%10) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
