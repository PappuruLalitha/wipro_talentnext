package java_fundamentals;
import java.util.Arrays;
public class Arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {69,90,62,12,3,30};
   Arrays.sort(arr);
	   System.out.println("Smallest Numbers: "+arr[0]+","+arr[1]);
	   System.out.println("Largest Numbers: "+arr[arr.length-2]+","+arr[arr.length-1]);
   }

}
