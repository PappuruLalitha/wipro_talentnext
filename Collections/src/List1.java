import java.util.ArrayList;
public class List1 {
public static void main(String[]args) {
	ArrayList<String> arr=new ArrayList<>();
	arr.add("January");
	arr.add("February");
	arr.add("March");
	arr.add("April");
	arr.add("May");
	arr.add("June");
	arr.add("July");
	arr.add("August");
	arr.add("September");
	arr.add("October");
	arr.add("November");
	arr.add("December");
	System.out.println("Months of the Year:");
	for(String months : arr) {
		System.out.println(months);
	}
}
}