package FourWheeler;
import com.automobile.Vehicle;
import twoWheeler.Hero;
import twoWheeler.Honda;
import FourWheeler.Ford;
import FourWheeler.Logan;
public class Packade4 {
		// TODO Auto-generated method stub
		    public static void main(String[] args) {
		        Hero   bike   = new Hero("Splendor Plus", "KA123", "Dhoni", 65);
		        Honda  honda  = new Honda("City ZX",       "MH456", "Virat", 90);
		        Logan  logan  = new Logan("Renault Logan", "AP789", "Rohit", 80);
		        Ford   ford = new Ford("EcoSport",     "TN023", "Sachin", 85);
		        System.out.println("\n=== HERO BIKE ===");
		        printInfo(bike);
		        System.out.println("Current speed : " + bike.getSpeed() + " km/h");
		        bike.radio();
		        System.out.println("\n=== HONDA CAR ===");
		        printInfo(honda);
		        System.out.println("Current speed : " + honda.getSpeed() + " km/h");
		        honda.cdplayer();
		        System.out.println("\n=== LOGAN CAR ===");
		        printInfo(logan);
		        System.out.println("Current speed : " + logan.getspeed() + " km/h");
		        logan.gps();
		        System.out.println("\n=== FORD CAR ===");
		        printInfo(ford);
		        System.out.println("Current speed : " + ford.getspeed() + " km/h");
		        ford.tempControl();

	}
		     static void printInfo(Vehicle v) {
		        System.out.println("Model       : " + v.getmodelName());
		        System.out.println("Reg Number  : " + v.getregistrationNumber());
		        System.out.println("Owner       : " + v.getownerName());
		    }
}
