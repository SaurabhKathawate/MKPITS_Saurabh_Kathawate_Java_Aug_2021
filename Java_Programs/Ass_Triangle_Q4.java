//4-Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
//by creating a class named 'Triangle' without any parameter in its constructor.

class Triangle{
	int side1,side2,side3,base,height;

	public Triangle(){
		this.side1=3;
		this.side2=4;
		this.side3=5;
	}
	public int perimeter(){
		return side1 + side2 + side3;
	}
	public Triangle(int base,int height){
		this.base=base;
		this.height=height;
	}
	public int area(){
		return  (base * height)/2;
	}
}

class Ass_Triangle_Q4{
	public static void main(String arg[]){
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle(6,5);
		System.out.println("Perimeter of Triangle: "+t1.perimeter());
		System.out.println("Area of Triangle: "+t2.area());
	}
}