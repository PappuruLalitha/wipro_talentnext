package java_fundamentals;

public class Arrays13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {1,2,3,4};
    for(int i=arr.length-1;i>=0;i--) {
    	System.out.print(arr[i]+" ");
    	if((arr.length-i) %2==0){
    		System.out.println();
    	}
    	
    }
	}

}
