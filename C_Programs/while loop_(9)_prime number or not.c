//9-wap to accept a no. and then print whether it is prime no. or not.
#include<stdio.h>
int main()
{
	int num;
	int i=2;
	printf("\nEnter no: ");
	scanf("%d",&num);
	
	while(num>i)
	{
		if(num%i==0)
		{
			printf("\nIt is not prime no=%d",num);
			break;
		}
		i++;
	}
		if(num==i)
		{
			printf("\nIt is prime no=%d",num);
		}
}

