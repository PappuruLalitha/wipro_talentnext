class Fruit{
	String name,taste,size;
	 public Fruit(String name,String taste,String size) {
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	public void eat() {
		System.out.println("Fruit: "+name+"\nTaste: "+taste+"\nsize: "+size);
	}
}
class Apple extends Fruit{
	public Apple(String name, String taste, String size) {
		super(name, taste, size);
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		System.out.println("Taste of the fruit: "+taste);
	}
}
class Orange extends Fruit{
	public Orange(String name, String taste, String size) {
		super(name, taste, size);
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		System.out.println("Taste of the orange: "+taste);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple=new Apple("Apple","sweet","Medium");
		Fruit orange=new Orange("Orange","sour","small");
		apple.eat();
		orange.eat();

	}

}
