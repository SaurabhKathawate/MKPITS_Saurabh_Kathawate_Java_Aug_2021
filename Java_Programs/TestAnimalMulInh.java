//Multilevel Inheritance Example
//When there is a chain of inheritance, it is known as multilevel inheritance.
//Here, BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance.

class Animal
{
    void eat()
    {System.out.println("eating...");}
}
class Dog extends Animal
{
    void bark()
    {System.out.println("barking...");}
}
class BabyDog extends Dog
{
    void weep()
    {System.out.println("weeping...");}
}
class TestAnimalMulInh
{
    public static void main(String args[])
    {
    	BabyDog d=new BabyDog();
    	d.weep();
    	d.bark();
    	d.eat();
    }
}
