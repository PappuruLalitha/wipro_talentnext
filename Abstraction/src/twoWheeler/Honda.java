package twoWheeler;
import com.automobile.Vehicle;
public class Honda extends Vehicle{
private final String modelName;
private final String registrationNumber;
private final String ownerName;
private final int currentSpeed;
public Honda(String modelName,String registrationNumber,String ownerName,int currentSpeed) {
	this.modelName=modelName;
	this.registrationNumber=registrationNumber;
	this.ownerName=ownerName;
	this.currentSpeed=currentSpeed;
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
public int getSpeed() {
	return currentSpeed;
}
public void cdplayer() {
	System.out.println("Honda cdplayer is playing songs");
}
}
