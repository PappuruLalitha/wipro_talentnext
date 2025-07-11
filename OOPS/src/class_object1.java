class Box{
	Double width;
	Double height;
	Double depth;
	Box(Double w,Double h,Double d){
		width = w;
		height = h;
		depth = d;
	}
	Double getVolume() {
		return width*height*depth;
	}
}
	public class class_object1{
		public static void main(String[]args) {
			Box myBox=new Box(4.0,3.0,5.0);
			double volume=myBox.getVolume();
			System.out.print("Volume of the Box: "+volume);
		}
	}