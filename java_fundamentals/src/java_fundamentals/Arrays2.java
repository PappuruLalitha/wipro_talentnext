package java_fundamentals;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {10,30,40,20,60};
    int a=arr[0];
    int b=arr[0];
    for(int i=0;i<arr.length;i++) {
    	a=Math.max(a,arr[i]);
    	b=Math.min(b,arr[i]);
    }
    System.out.println("Maximum: "+a);
    System.out.println("Minimum: "+b);
	}

}
