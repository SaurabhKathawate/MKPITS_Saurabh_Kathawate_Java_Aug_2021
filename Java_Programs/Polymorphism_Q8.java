//Rule: Runtime polymorphism can't be achieved by data members.

class Bike{
     int speedlimit=90;
    }

class Honda extends Bike{
     int speedlimit=150;
	}

class Polymorphism_Q8{
		public static void main(String args[]){
		Bike obj=new Honda3();
		System.out.println(obj.speedlimit);    //90
    }
}