class employee {
	String empname="rajesh";
}
class parttimeemployee extends employee {
	String empname="amit";
	void display() {
		System.out.println("parttime emp name is " + empname); //amit
		System.out.println("employee name is " + super.empname); // rajesh
	}

}

    class Animal_Employee{
    public static void main(String args[]){
		parttimeemployee p1=new parttimeemployee();
		p1.display();

    }}
