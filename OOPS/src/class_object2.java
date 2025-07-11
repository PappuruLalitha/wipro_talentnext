class calculator{
	public static int powerInt(int num1,int num2) {
		return (int) Math.pow(num1 , num2);
	}
	public static double powerDouble(double num1, double num2) {
		return Math.pow(num1,num2);
	}
}
public class class_object2{
	public static void main(String[]args) {
		int intResult=calculator.powerInt(2, 3);
		double doubleResult=calculator.powerDouble(2.5, 3);
		System.out.println("IntResult Value: "+intResult);
		System.out.println("DoubleResult Value: "+doubleResult);
	}
}