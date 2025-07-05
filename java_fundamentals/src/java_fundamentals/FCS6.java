package java_fundamentals;
import java.util.Scanner;
public class FCS6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a gender:");
		String gender=sc.nextLine();
		int age=sc.nextInt();
     if(gender.equals("Female")){
    	 if(age>=1 && age<=58) {
    		 System.out.println("8.2%");
    	 }else if(age>=59 && age<=100) {
    		 System.out.println("9.2%");
    	 }
     }else if(gender.equals("Male")) {
    		 if(age>=1 && age<=58) {
    			 System.out.println("8.4%");
    		 }else if(age>=59 && age<=100) {
    			 System.out.println("10.5%");
    		 }
    	 }else {
    		 System.out.println("Invalid output");
    	 }
     
	}

}
