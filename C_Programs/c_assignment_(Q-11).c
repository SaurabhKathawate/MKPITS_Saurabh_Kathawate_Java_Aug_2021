//11-wap to accept a no and print factorial of that number
#include<stdio.h>
int main()
{
	int num,i,fact=1;
	printf("Enter number: ");
	scanf("%d",&num);
	
	for(i=num;i>0;i--)
	{
		fact=fact*i;
	}
	printf("\nFactorial of No=%d",fact);
}
