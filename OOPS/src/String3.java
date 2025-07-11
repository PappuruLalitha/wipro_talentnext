import java.util.Scanner;
public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String: ");
    String str=sc.nextLine();
    int n=str.length();
    if(n > 2) {
    	String firstTwo=str.substring(0,2);
    	StringBuffer result=new StringBuffer();
    	for(int i=0;i<n;i++) {
    		result.append(firstTwo);
    	}
    	System.out.println("output: "+result.toString());
    }
	}

}
