//18-wap to create a function calculate with two integer arguments and return the addition of two arguments.
#include<stdio.h>
int calculate(int num1, int num2)
{
	int cal;
	cal=num1+num2;
	return cal;
}

int main()
{
	int n1,n2,cal;
	printf("Enter 2 number: ");
	scanf("%d%d",&n1,&n2);
	cal=calculate(n1,n2);
	printf("\nAddition=%d",cal);
}
