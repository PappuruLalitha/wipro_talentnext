package FourWheeler;
import com.automobile.Vehicle;
public class Logan extends Vehicle {
String modelName;
String registrationNumber;
String ownerName;
int speed;
public Logan(String modelName,String registrationNumber,String ownerName,int speed){
this.modelName=modelName;
this.registrationNumber=registrationNumber;
this.ownerName=ownerName;
this.speed=speed;
}
public String getmodelName() {
	return modelName;
}
 public String getregistrationNumber() {
	 return registrationNumber;
 }
 public String getownerName() {
	 return ownerName;
 }
 public int getspeed() {
	 return speed;
 }
 public void gps() {
	 System.out.println("Control to gps Vehicle");
 }
}
