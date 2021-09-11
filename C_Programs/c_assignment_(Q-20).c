//20-wap to create a function calculate with 3 float arguments and display the addition of 3 no.
#include<stdio.h>
void cal(float num1,float num2, float num3)
{
	float result;
	result=num1+num2+num3;
	printf("\nAddition of 3 no=%.2f",result);
}
int main()
{
	float n1,n2,n3;
	printf("Enter 3 numbers: ");
	scanf("%f%f%f",&n1,&n2,&n3);
	cal(n1,n2,n3);
}
