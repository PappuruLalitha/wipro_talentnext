package java_fundamentals;

public class FCS13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=99;
     for(int i=10;i<=num;i++) {
    	 boolean isprime=true;
    	 for(int j=2;j<=i/2;j++) {
    		 if(i%j==0) {
    			 isprime=false;
    		 }
    	 }
    	 if(isprime && i>1) {
    		 System.out.print(i+" ");
    	 }
     }
	}

}
