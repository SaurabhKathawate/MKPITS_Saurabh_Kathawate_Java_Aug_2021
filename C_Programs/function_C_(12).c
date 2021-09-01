//C-function with return value and with parameters
//12-wap to create a function factorial with one int parameter, calculate factorial and return the factorial.
#include<stdio.h>
int factorial(int n1)
{
	int fact=1;
	while(n1>0)
	{
		fact=fact*n1;
		n1--;
	}
	return fact;
}
//creating a main function
int main()
{
	int n1,fact;
	printf("\nEnter no: ");
	scanf("%d",&n1);
	//calling the function calculate and passing arguments 
	fact= factorial(n1);
	printf("\nFactorial = %d",fact);
}

