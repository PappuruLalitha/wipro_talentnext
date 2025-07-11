import java.util.Scanner;
public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String: ");
    String a=sc.nextLine();
    String b=sc.nextLine();
    StringBuffer result=new StringBuffer();
    int length=Math.max(a.length(),b.length());
    for(int i=0;i<length;i++) {
    	if(i<a.length()) {
    		result.append(a.charAt(i));
    	}
    	if(i<b.length()) {
    		result.append(b.charAt(i));
    	}
    }
    System.out.println("Result: "+result.toString());
	}

}
