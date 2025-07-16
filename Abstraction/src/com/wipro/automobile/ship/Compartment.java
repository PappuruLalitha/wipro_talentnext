package com.wipro.automobile.ship;

public class Compartment {
   double height;
    double width;
    double breadth;
   Compartment(double height, double width,double breadth){
	   this.height=height;
	   this.width=width;
	   this.breadth=breadth;
   }
   public double getheight() {
	   return height;
   }
   public double getwidth() {
	   return width;
   }
   public double getbreadth() {
	   return breadth;
   }
   public double CalculateVolume() {
	   return height*width*breadth;
   }
   public void printdetails() {
	   System.out.println("Compartment Dimensions");
	   System.out.println("Height: "+height);
	   System.out.println("Widht: "+width);
	   System.out.println("Breadth: "+breadth);
	   System.out.println("Calculate Volume: "+CalculateVolume());
   }
}
