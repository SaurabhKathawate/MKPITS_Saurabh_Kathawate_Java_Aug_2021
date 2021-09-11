//10(B)-wap to print no. from 1 to 10 using while, dowhile and for loop.
#include<stdio.h>
int main()
{
	int num=1;
	//printf("Enter number: ");
	//scanf("%d",&num);
	
	do
	{
		printf("\n%d",num);
		num++;
	}
	while(num<=10);
}
