//8-wap to accept length, breadth and height and print volume of cube.
#include <stdio.h> 
int main() 
{
	int l,b,h,volume;
	printf("\n Enter value of l,b,h: ");
	scanf("%d%d%d",&l,&b,&h);
	volume=l*b*h;
	printf("\n Volume of Cube=%d",volume);
}

