//D-function with return value and no parameters
//13-wap to create a function factorial, calculate factorial and return the factorial.
#include<stdio.h>
int factorial() 
{
	int num,fact=1;
	printf("\nEnter number: ");
	scanf("%d",&num);
	
	while(num > 0)
	{
		fact = fact * num;
		num--;
	}
	return fact;
}
//creating a main function
int main() 
{
	int result;
	result=factorial();
	printf("\nfactorial=%d",result);
}

