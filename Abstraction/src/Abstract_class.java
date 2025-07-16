abstract class Compartment{
	public abstract void notice();
}
class FirstClass extends Compartment{
	public void notice() {
	System.out.println("Notice:You are in FirstClass Compartment");
}
}
class Ladies extends Compartment{
	public void notice() {
		System.out.println("Notice:You are in Ladies Compartment");
	}
}
class General extends Compartment{
	public void notice() {
		System.out.println("Notice:You are in General Compartment");
	}
}
class Luggage extends Compartment{
	public void notice() {
		System.out.println("Notice:You are in Luggage Compartment");
	}
}
public class Abstract_class {
public static void main(String[]args) {
	Compartment[] train=new Compartment[10];
	for(int i=0;i<train.length;i++) {
		int r=1+(int)(Math.random()*4);
		switch(r) {
		case 1:train[i]=new FirstClass(); break;
		case 2:train[i]=new Ladies(); break;
		case 3:train[i]=new General(); break;
		case 4:train[i]=new Luggage(); break;
		}
	}
	System.out.println("===Coach Notice====");
	for(Compartment c : train) {
		c.notice();
	}
}
}
