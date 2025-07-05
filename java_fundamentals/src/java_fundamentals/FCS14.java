package java_fundamentals;

public class FCS14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=1234,sum=0,dig;
    while(num!=0) {
    	dig=num%10;
    	sum=sum+dig;
    	num/=10;
    }
    System.out.println(sum);
	}
	

}
