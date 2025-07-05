package java_fundamentals;

public class FCS16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234,dig,rev=0;
		while(num>0) {
			dig=num%10;
			rev=rev*10+dig;
			num/=10;
		}
		System.out.println(rev);

	}

}
