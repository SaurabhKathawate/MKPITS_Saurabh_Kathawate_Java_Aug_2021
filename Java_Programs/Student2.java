//Example of Constructor Overloading
//Java Program to demonstrate the use of the parameterized constructor.
    class Student2{
        int id;
        String name;
        //creating a parameterized constructor
        Student2(int i){
		        id = i;

        }
        //constructor overloading
        Student2(int i,String n){
        id = i;
        name = n;
        }
        //method to display the values
        void display()
        {System.out.println(id+" "+name);}

        public static void main(String args[]){
        //creating objects and passing values
        Student2 s1 = new Student2(111);
        Student2 s2 = new Student2(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
       }
    }
