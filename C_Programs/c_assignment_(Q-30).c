//30-Write a C program to determine whether a given number is prime or not.
#include<stdio.h>
int main()
{
	int num,i;
	printf("Enter number: ");
	scanf("%d",&num);
	for(i=2;i<num;i++)
	{
		if(num%i==0)
		{
			printf("\nIt is not prime number");
			break;
		}
	}
	if(num==i)
	{
		printf("\nIt is prime number");
	}
}
