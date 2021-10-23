//Returning Array from the Method

//We can also return an array from the method in Java.

    class Array_Q10{
	static	int[] marks()
		{
			return new int[] {44,66,88};
		}

    public static void main(String args[]){
		int m[]=marks();
		for(int val : m) {
			System.out.println("marks " + val);
		}

    }}
