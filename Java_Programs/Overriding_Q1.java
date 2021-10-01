//Method Overriding in Java
//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

class figure {
	void draw() {
		System.out.println("draw method of figure class");
		}
	}

class triangle extends figure {
	void draw() {
		System.out.println("draw method of traingle class");
		}
	}

class Overriding_Q1 {
	public static void main(String[] args) {
		figure f=new figure();
		f.draw();
		triangle t=new triangle();
		t.draw();
		}
	}
