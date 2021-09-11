//23-create a function to check whether no is prime or not.
#include<stdio.h>
void result(num)
{
	int result;
	int i;
	for(i=2;num>i;i++)
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
int main()
{
	int num,i;
	printf("Enter number: ");
	scanf("%d",&num);
	result(num);
}
