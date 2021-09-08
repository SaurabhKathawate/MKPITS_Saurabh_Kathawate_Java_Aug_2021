//5-wap to create an char array of 5 elements to store 5 character,
//accept 5 character from the user and store it in an array usimg for loop
//then display the value stored in an array.
#include<stdio.h>
int main()
{
	int i;
	char ch[5];
	for(i=0;i<5;i++)
	{
		printf("\n Enter Character: ");
		fflush(stdin);
		scanf("%c",&ch[i]);
	}
	for(i=0;i<5;i++)
	{
		printf("\n ch[%d]=%c",i,ch[i]);
	}
}
 
