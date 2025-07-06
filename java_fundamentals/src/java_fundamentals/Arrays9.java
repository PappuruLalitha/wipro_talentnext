package java_fundamentals;
import java.util.Arrays;
public class Arrays9 {
	public static void main(String[]args) {
		int arr[]= {1,10,2,10};
		int result[]=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=10) {
				result[index]=arr[i];
				index++;
			}
		}
		if(index<arr.length) {
			result[index]=0;
			index++;
		}
		System.out.println("Output: "+Arrays.toString(result));
	}
}