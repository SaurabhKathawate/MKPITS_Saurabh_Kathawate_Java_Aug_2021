//1-Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
//First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
//Length and breadth of rectangle are entered through keyboard.

class Area{
	int length;
	int breadth;

	void setDim(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
		}

		int getArea(){
		return length * breadth;
		}
}

class Ass_Area_Q1{
	public static void main(String arg[]){
		Area a = new Area();
		a.setDim(8,5);
		System.out.println("Area of Rectangle: "+a.getArea());
		}
}
