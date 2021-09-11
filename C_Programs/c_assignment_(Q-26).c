//26-create a function to caluclate area of a rectangle.
#include<stdio.h>
void cal()
{
	int l,b,area;
	printf("\nEnter l and b: ");
	scanf("%d%d",&l,&b);
	area=l*b;
	printf("\nArea of rectangle=%d",area);
}
int main()
{
	cal();
}
