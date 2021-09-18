//Copying values without constructor
//We can copy the values of one object into another by assigning the objects values to another object. In this case, there is no need to create the constructor.

class Student5
{
    int id;
    String name;
    Student5(int i,String n){
    id = i;
    name = n;
}

class Student5()
{
    public void display()
    {System.out.println(id+" "+name);}
        public static void main(String arg[])
    {
        Student5 s1 = new Student5(111,"Karan");
        Student5 s2 = new Student5();
        s2.id=s1.id;
        s2.name=s1.name;
        s1.display();
        s2.display();
    }
}
