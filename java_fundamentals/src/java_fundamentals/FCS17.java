package java_fundamentals;

public class FCS17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=110011,temp,dig,rev=0;
    temp=num;
    while(num!=0) {
    	dig=num%10;
    	rev=rev*10+dig;
    	num/=10;
    }
    if(temp==rev) {
    	System.out.println("Palindrome");
    }else {
    	System.out.println("Not Palindrome");
    }
	}

}
