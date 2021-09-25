//The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. 
//In other words, it is used if method is overridden.

class employee {
	String empname="rajesh";
	void display() {
		System.out.println("employee name is " + empname);
	}
}
class parttimeemployee extends employee {
	String empname="amit";
	void display() {
		super.display();
		System.out.println("parttime emp name is " + empname); //amit

	}

}

    class Animal_Employee1{
    public static void main(String args[]){
		parttimeemployee p1=new parttimeemployee();
		p1.display();

    }}
