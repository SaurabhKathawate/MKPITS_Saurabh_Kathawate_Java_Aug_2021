//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
//Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class Student{
	int roll_no;
	String name;

	void insert(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;
	}
	void display(){
		System.out.println("Roll Number: "+roll_no);
		System.out.println("Student Name: "+name);
	}
}

class Ass_Student_Q2{
	public static void main(String arg[]){
		Student s = new Student();
		s.insert(02,"John");
		s.display();
	}
}