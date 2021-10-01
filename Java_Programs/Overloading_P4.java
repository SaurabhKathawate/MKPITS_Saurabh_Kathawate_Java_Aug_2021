class Addition{
	static float add(float n1,float n2){
		return n1+n2;
	}
	static double add(double n1, double n2){
		return n1+n2;
	}
}

class Overloading_P4{
	public static void main(String arg[]){
		Addition a=new Addition();
		float res1=a.add(1.5f,2.5f);
		System.out.println("Addition of 2 No: "+res1);
		double res2=a.add(25.5,24.5);
		System.out.println("Addition of 2 No: "+res2);
	}
}