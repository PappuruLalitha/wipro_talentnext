package twoWheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle {
   String modelName;
  String registrationNumber;
String ownerName;
int currentSpeed;
 public Hero(String modelName,String registrationNumber,String ownerName,int currentSpeed){
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
 public void radio() {
	 System.out.println("Hero Radio is playing FM 101.43 MHZ");
 }
}