//In this example, if you create the instance of Rectangle class, draw() method of Rectangle class will be invoked.

abstract class Shape{
    abstract void draw();
    }
    //In real scenario, implementation is provided by others i.e. unknown by end user

class Rectangle extends Shape{
    void draw(){System.out.println("drawing rectangle");}
    }

class Circle extends Shape{
    void draw(){System.out.println("drawing circle");}
    }

//In real scenario, method is called by programmer or user
	class Abstract_Q5{
		public static void main(String args[]){
			Shape s=new Rectangle();   //drawing rectangle
			//Shape s1=new Circle();   //drawing circle
			s.draw();
    }
}
