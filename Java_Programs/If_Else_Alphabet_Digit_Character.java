//12-Write a C program to check whether a character is an alphabet, digit or special character
import java.util.*;
class If_Else_Alphabet_Digit_Character
{
	public static void main(String arg[])
	{
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any character: ");
		ch=s.next().charAt(0);
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		    {
		        System.out.println("It is alphabet");
		    }
		    else if(ch >= '0' && ch <= '9')
		    {
		        System.out.println("It is digit");
		    }
		    else
		    {
		        System.out.println("It is special character");
            }
	}
}