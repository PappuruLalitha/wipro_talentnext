import music.playable;
import music.string.veena;
import music.wind.Saxophone;
public class live {
public static void main(String[]args) {
	veena a=new veena();
	Saxophone b=new Saxophone();
	System.out.println("Direct instance class : ");
	a.play();
	b.play();
	System.out.println("Using playable interface : "); 
	playable p1=a;
	playable p2=b;
	p1.play();
	p2.play();
}
}
