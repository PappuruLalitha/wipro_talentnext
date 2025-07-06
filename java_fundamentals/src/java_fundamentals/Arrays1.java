package java_fundamentals;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {1,2,3,4};
    int sum=0;
    for(int i=0;i<arr.length;i++) {
    	sum+=arr[i];
    }
    	int average=sum/2;
    
    System.out.println("Sum of the array: "+sum);
    System.out.println("average of the array: "+average);
	}

}
