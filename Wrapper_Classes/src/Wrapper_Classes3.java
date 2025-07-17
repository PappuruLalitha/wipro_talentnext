import java.util.Scanner;
public class Wrapper_Classes3 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	if(num < 1 || num > 255) {
		System.out.println("Invalid output");
	}else {
		String binary=Integer.toBinaryString(num);
		String digit=String.format("%8s", binary).replace(' ', '0');
		System.out.println("Output Contain 8 digits: "+digit);
	}
}
}
