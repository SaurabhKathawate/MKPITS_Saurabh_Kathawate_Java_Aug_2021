//27-create a function to calculate area and circ. of a circle.
#include<stdio.h>
void cal(int r)
{
	float pi=3.14,area,circ;
	area=pi*r*r;
	circ=2*pi*r;
	printf("\nArea of circle=%.2f",area);
	printf("\nCircumference of circle=%.2f",circ);
}
int main()
{
	int r;
	//float pi=3.14,area,circ;
	printf("Enter radius: ");
	scanf("%d",&r);
	cal(r);
}
