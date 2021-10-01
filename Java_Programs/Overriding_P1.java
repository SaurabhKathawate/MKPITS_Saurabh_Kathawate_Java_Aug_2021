//Method Overriding in Java
//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

class Figure{
	void draw(){System.out.println("parent class");}
}
class Triangle extends Figure{
	void draw(){System.out.println("child class");}
}

class Overriding_P1{
	public static void main(String arg[]){
		Figure f=new Figure();
		f.draw();
		Triangle t=new Triangle();
		t.draw();
	}
}