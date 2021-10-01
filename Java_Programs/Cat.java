//Example of static binding

class Cat{
	private void eat(){System.out.println("cat is eating...");}

	public static void main(String args[]){
	Cat c1=new Cat();
	c1.eat();
	}
}
