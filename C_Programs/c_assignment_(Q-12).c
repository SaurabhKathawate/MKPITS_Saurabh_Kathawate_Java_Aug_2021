//12-wap to accept a no and print whether it a prime no. or not.
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
			printf("\nIt is not prime no");
			break;
		}
	}
	if(num==i)
	{
		printf("\nIt is prime no");
	}
}

