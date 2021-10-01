//Example of Method Overloading with TypePromotion (if no matching datatype is found)

class Overloading_Q8{
	void sum(int a,long b) {
		System.out.println(a+b);
		}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
		}

	public static void main(String args[]){
      	Overloading_Q8 obj=new Overloading_Q8();
      	obj.sum(20,20);//now second int literal will be promoted to long
      	obj.sum(20,20,20);

      }
}
