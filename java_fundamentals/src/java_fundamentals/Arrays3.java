package java_fundamentals;
import java.util.Scanner;
public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,34,56,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		boolean num=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				System.out.println("Index: "+i);
				num=true;
				break;
			}
		}
		if(!num) {
			System.out.println("-1");
		}

	}

}
