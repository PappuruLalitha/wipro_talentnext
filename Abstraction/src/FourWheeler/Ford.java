package FourWheeler;
import com.automobile.Vehicle;
public class Ford extends Vehicle{
String modelName;
String registrationNumber;
String ownerName;
int speed;
public Ford(String modelName,String registrationNumber,String ownerName,int speed) {
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
public void tempControl() {
	System.out.println("Based on temperature Can Control");
}
}
