class shape{
	public void draw() {
		System.out.println("Drawing Shape");
	}
	public void erase() {
		System.out.println("Erasing Shape");
	}
}
class circle extends shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public void erase() {
		System.out.println("Erasing Ciricle");
	}
}
class triangle extends shape{
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
class square extends shape{
	public void draw() {
       System.out.println("Drawing Square");
}
	public void erase() {
		System.out.println("Erasing Square");
	}
}
public class Polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   shape c=new circle();
   c.draw();
   c.erase();
   shape t=new triangle();
   t.draw();
   t.erase();
   shape s=new square();
   s.draw();
   s.erase();
	}

}
