    class Animal
    {
	    String color="white";
	    }
    class Dog extends Animal
	    {
	    String color="black";
	    void printColor()
	{

	    System.out.println(super.color);//prints color of Animal class
	    }
	    }
	        class BabyDog extends Dog
			    {
			    String color="brown";
			    void printColor1()
			{

			    System.out.println(color);//prints color of Dog class
			    System.out.println(super.color);//prints color of Animal class
			    printColor();
			    }
	    }
	    class Animal_Super1
	    {
	    public static void main(String args[])
	    {
	    BabyDog d=new BabyDog();
	    d.printColor1();
    }}
