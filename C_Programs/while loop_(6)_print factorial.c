//6-wap to accept a no. print factorial of that no using while loop
#include<stdio.h>
int main()
{
	int num,fact=1;
	printf("\nEnter no: ");
	scanf("%d",&num);
	while(num>0)
	{
		fact=fact*num;
		num--;
	}
	{
		printf("\nFactorial of No=%d",fact);
	}
}

