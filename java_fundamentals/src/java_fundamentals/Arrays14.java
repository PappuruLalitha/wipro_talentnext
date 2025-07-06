package java_fundamentals;

public class Arrays14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {1,23,45,55,121,122,56,77,89};
   int large=arr[0];
   for(int i=0;i<arr.length;i++) {
	   System.out.print(arr[i]+" ");
	   if(arr[i]>large) {
		   large=arr[i];
	   }
	   if((i+1)%3==0) {
		   System.out.println();
	   }
   }
   System.out.println("Largeest Number in the given array is: "+large);
	}

}
