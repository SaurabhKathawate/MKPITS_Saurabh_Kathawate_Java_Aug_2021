//Assign and print the roll_number, phone_number and address of two students having names "Sam" and "John" respectively
//by creating two objects of class 'Student'.

class Address{
	String city;
	String state;
	String country;
	Address(String city,String state, String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
}

class Student{
	int roll_number;
	long phone_number;
	Address address;
	Student(int roll_number,long phone_number,Address address){
		this.roll_number=roll_number;
		this.phone_number=phone_number;
		this.address=address;
	}
	void display(){
		System.out.println("Roll Number: "+roll_number);
		System.out.println("Phone Number: "+phone_number);
		System.out.println("City: "+address.city);
		System.out.println("State: "+address.state);
		System.out.println("Country: "+address.country);
	}
}

class Ass_Student_Q3{
	public static void main(String arg[]){
		Address add = new Address("Nagpur","Maharashtra","India");
		System.out.println("Student Name: Sam");
		Student s1 = new Student(05,7122582099L,add);
		s1.display();
		System.out.println("-----------------------------------");
		System.out.println("Student Name: John");
		Student s2 = new Student(10,9028436561L,add);
		s2.display();
	}
}