interface vehicle{
	default void message() {
		System.out.println("Inside Vehicle");
	}
}
interface FourWheeler{
	default void message() {
		System.out.println("Inside FourWheeler");
	}
}
public class interface_newfeature1 implements vehicle,FourWheeler{
	public void message() {
		vehicle.super.message();
		FourWheeler.super.message();
	}
	public static void main(String[]args) {
		interface_newfeature1 obj=new interface_newfeature1();
		obj.message();
	}
}