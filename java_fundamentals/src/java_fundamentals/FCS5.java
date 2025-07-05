package java_fundamentals;

public class FCS5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char ch='v';
    if(ch >='a' && ch <='z' ||ch >='A' && ch<='Z') {
    	System.out.println("Alphabets");
    }else if(ch >= '0' && ch <= '9') {
    	System.out.println("Digits");
    }else {
    	System.out.println("Special Characters");
    }
	}

}
