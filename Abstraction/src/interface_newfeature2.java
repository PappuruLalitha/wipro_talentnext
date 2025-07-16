interface Test{
	int myFunction(int a,int b,int c);
}
public class interface_newfeature2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Test t1=(a,b,c)->a+b+c;
    Test t2=(a,b,c)->a*b*c;
    int sum=t1.myFunction(20,50,30);
    int product=t2.myFunction(3,5,7);
    System.out.println("Sum: "+sum);
    System.out.println("Product: "+product);
	}
}
