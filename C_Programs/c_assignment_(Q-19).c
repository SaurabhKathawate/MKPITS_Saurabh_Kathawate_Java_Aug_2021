//19-wap to create a function calculate with 3 float arguments and return the addition of 3 float numbers.
#include<stdio.h>
float calculate(float num1, float num2, float num3)
{
	float result;
	result=num1+num2+num3;
	return result;
}
int main()
{
	float n1,n2,n3,res;
	printf("Enter 3 numbers: ");
	scanf("%f%f%f",&n1,&n2,&n3);
	res=(float) calculate(n1,n2,n3);
	printf("\nAddition of 3 float number=%.2f",res);
}
