//8-wap to accept character and print whether it is vowel or not.
#include<stdio.h>
int main()
{
	char ch;
	printf("Enter alphabet: ");
	scanf("%c",&ch);
	switch(ch)
	{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			printf("\nIt is vowel");
			break;
		default:
			printf("\nIt is not vowel");
			break;
	}
}

