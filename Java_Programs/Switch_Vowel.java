//2-wap to accept a character and print whether it is vowel or not using switch
import java.util.*;
class Switch_Vowel
{
	public static void main(String arg [])
	{
		char alphabet;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any alphabet: ");
		alphabet= s.next().charAt(0);
		switch(alphabet)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println("char is vowel");
			break;
			default:
			System.out.println("char is not vowel");
			break;
	    }
	}
}