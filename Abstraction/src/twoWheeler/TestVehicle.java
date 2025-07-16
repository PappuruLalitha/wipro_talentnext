package twoWheeler;
import com.automobile.Vehicle;
import twoWheeler.Hero;
import twoWheeler.Honda;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Hero RE=new Hero("RoyalEnfield ","AP3379","Lalitha",60);
   Honda BMW=new Honda("BMW","BM432","Lucky",90);
   System.out.println("=====Hero Bike=====");
   getmyInfo(RE);
   System.out.println("current speed of bike: "+RE.getSpeed()+"km/h");
   RE.radio();
   System.out.println("=====Honda Car=====");
   getmyInfo(BMW);
   System.out.println("current speed of car: "+BMW.getSpeed()+"km/h");
   BMW.cdplayer();
   
	}
public static void getmyInfo(Vehicle v) {
	System.out.println("Model: "+v.getmodelName());
	System.out.println("Registration Number: "+v.getregistrationNumber());
	System.out.println("Owner Name: "+v.getownerName());
}
}
