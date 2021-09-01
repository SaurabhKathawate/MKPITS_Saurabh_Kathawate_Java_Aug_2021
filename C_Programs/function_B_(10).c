//B-function with parameters and returning nothing (void)
//10-wap to create function calarea with one int parameter to accept radius, calculate and display area and circ of circle.
#include<stdio.h>
void calarea(int r)
{
	float pi=3.14,area,circ;
}
int main()
{
	int r;
	float pi=3.14,area,circ;
	printf("\nEnter Radius: ");
	scanf("%d",&r);
	area=pi*r*r;
	circ=2*pi*r;
	printf("\nArea of Circle=%.2f",area);
	printf("\nCircumference of Circle=%.2f",circ);
	printf("\nbye from main function");
}
