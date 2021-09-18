//Java Program to illustrate how to define a class and fields
import java.util.*;
//Defining a Student class.
class Student
{
	//defining fields
	int id;                                          //field or data member or instance variable
    String name;

    //creating main method inside the Student class
    public static void main(String arg[])
    {
    	//Creating an object or instance
    	Student s1=new Student();                    //creating an object of Student
    	s1.id=111;
    	s1.name="amarjout";

    //Printing values of the object
    System.out.println(s1.id);                       //accessing member through reference variable
    System.out.println(s1.name);
    }
}
