class Author{
	String name,email;
	char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public String toString() {
		return "Author Name: "+ name +"\nEmail: "+email+"\ngender: "+gender;
	}
}
class Book{
	String name;
	Author author;
	double price;
	int qtyInStock;
	Book(String name,Author author,double price,int qtyInStock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getqtyInStock() {
		return qtyInStock;
	}
	public void setName() {
		this.name=name;
	}
	public void setAuthor() {
		this.author=author;
	}
	public void setPrice() {
		this.price=price;
	}
	public void setqtyInStock() {
		this.qtyInStock=qtyInStock;
	}
	public String toString() {
		return "Book Name: "+name+"\n"+author+"\n"+"price: "+price+"\n"+"Quantity In Stock: "+qtyInStock;
				}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Author a=new Author("abc","abc@gmail.com",'F');
   Book b=new Book("The Real Yogi",a,499.99,100);
   System.out.println(b);
	}

}
