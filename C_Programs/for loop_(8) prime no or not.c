//8-wap to accept a no and print whether it is a prime no or not
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
			printf("\n It is not prime no");
			break;
		}
	}
		if(num==i)
		{
			printf("\n It is prime no");
    	}
}

