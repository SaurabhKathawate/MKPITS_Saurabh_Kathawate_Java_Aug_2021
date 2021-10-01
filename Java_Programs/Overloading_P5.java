class Employee{
	void getdata(String name){
		System.out.println("Name: "+name);
	}
	void getdata(String name, String address){
			getdata("Amit");
			System.out.println("Address: "+address);
	}
}

class Overloading_P5{
	public static void main(String arg[]){
		Employee e=new Employee();
		e.getdata("Amit","Nagpur");
	}
}