package java_fundamentals;

public class FCS12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=7,count=0;
  for(int i=1;i<=num;i++) {
	  if(num%i==0) {
		  count++;
	  }
  }
	  if(count==2) {
		  System.out.println("prime");
	  }else {
		  System.out.println("not");
	  }
	}

}
