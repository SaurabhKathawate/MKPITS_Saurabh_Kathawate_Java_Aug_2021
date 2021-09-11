//25-create a function to calculate area of traingle.
#include<stdio.h>
void cal(int area)
{
	int b,h;
	area= b*h ;
	printf("\nArea of Triangle=%d",area);
	
}
int main()
{
	int b,h,area;
	printf("Enter b and h: ");
	scanf("%d%d",&b,&h);
	cal(area);
}
