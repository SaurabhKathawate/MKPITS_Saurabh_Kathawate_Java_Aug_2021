//Multidimensional Array in Java

//In such case, data is stored in row and column based index (also known as matrix form).

//Example to instantiate Multidimensional Array in Java
// int[][] arr=new int[3][3];//3 row and 3 column

    import java.util.*;
    class Array_Q15{

    public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int[][] arr=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("enter number");
				arr[i][j]=scan.nextInt();
			}
		}
		//display
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j] + "  ");
			}
				System.out.println();
		}
    }
    }
