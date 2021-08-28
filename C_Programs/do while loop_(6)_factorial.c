//6-wap to accept a number and print factorial of a number using do while loop
#include<stdio.h>
int main()
{
	int num,i=1,fact=1;
	printf("Enter number: ");
	scanf("%d",&num);
	do
	{
	    fact=fact * i;
	    i++;
	}
	while(i<=num);
	printf("\nFactorial of the no is=%d",fact);
	printf("\nThe End");
}

