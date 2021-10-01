//

class student {
	void getdata(String  name) {
		System.out.println("name is  " + name);
	}
	void getdata(String name,String address) {
		getdata("amit");
		System.out.println("address is " + address);
	}
}

class Overloading_Q7 {
	public static void main(String[] args) {
		student s1=new student();
		s1.getdata("amit","sadar");
		}
}
