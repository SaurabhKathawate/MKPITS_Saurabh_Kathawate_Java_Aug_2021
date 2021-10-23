//ArrayIndexOutOfBoundsException

//JVM throws an ArrayIndexOutOfBoundsException if length of the array in negative, equal to the array size or greater than the array size while traversing the array.
    class Array{
	static	int[] marks()
		{
			int arr[] = {55,66,88,99};
			return arr;
		}

    public static void main(String args[]){
		int m[]=marks();
		for(int i=0;i<5;i++)
		{
			System.out.println(m[i]);
		}

    }}

    //Java Program to demonstrate the case of
    //ArrayIndexOutOfBoundsException in a Java Array.
    public class Array_Q13{
    public static void main(String args[]){
    int arr[]={50,60,70,80};
    for(int i=0;i<=arr.length;i++){
    System.out.println(arr[i]);
    }
    }}
