//22-create a function to calculate factorial of a number
#include<stdio.h>
void fact(num)
{
	int fact=1;
	while(num>0)
	{
		fact=fact*num;
	    num--;
	}
	printf("Factorial=%d",fact);
}
int main()
{
	int num;
	printf("Enter number: ");
	scanf("%d",&num);
	fact(num);
}
