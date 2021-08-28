//12-wap to print prime no. between 1 and 20 using while loop.
#include<stdio.h>
int main() 
{
	int num;
	int i=2;
	printf("\nEnter no: ");
	scanf("%d",&num);
	
	while(i<num)
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
	printf("\n bye");
	
}

